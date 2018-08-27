package com.wxy.controller;

import com.wxy.model.Company;
import com.wxy.model.User;
import com.wxy.service.CompanyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@RestController
@CrossOrigin
@RequestMapping("/company")
public class CompanyController {
    private Map<String,String> types=new HashMap<>();
    CompanyController(){
        types.put("image/jpeg", ".jpg");
        types.put("image/gif", ".gif");
        types.put("image/x-ms-bmp", ".bmp");
        types.put("image/png", ".png");
    }
    @Autowired
    CompanyServiceImp companyServiceImp;
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    ResponseEntity<User> updateCompany(@RequestBody Company company, HttpSession httpSession){
        User user=(User) httpSession.getAttribute("user");
        Company company1=companyServiceImp.findCompanyByUid(user.getUid());
        if(company1!=null){
            company.setCid(company1.getCid());
            company.setCphotopath(company1.getCphotopath());
            company.setUid(user.getUid());
            company.setUsername(user.getUsername());
        }
        companyServiceImp.updateCompany(company);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
@RequestMapping(value = "/uploadImg",method = RequestMethod.POST)
public ResponseEntity<Company> upload(@RequestParam("imgFile") MultipartFile imgFile, HttpServletRequest request, HttpSession httpSession) throws ServletException, IOException {
    String suffix=types.get(imgFile.getContentType());
    Company company=null;
    User user=(User) httpSession.getAttribute("user");
    company=companyServiceImp.findCompanyByUid(user.getUid());
    if(company==null){
        company=new Company();
        company.setUid(user.getUid());
        company.setUsername(user.getUsername());
    }
    try {
        String uuid= UUID.randomUUID().toString().replaceAll("-","");
        String src=this.getClass().getClassLoader().getResource("").getPath();
        String filename=src+"static/upload/"+uuid+suffix;
        filename= filename.substring(1);
        System.out.println(filename);
        File file=new File(filename);
        imgFile.transferTo(file);

        String requestURLpath=request.getRequestURI().toString();
        requestURLpath=requestURLpath.substring(0,requestURLpath.lastIndexOf("/"));
        requestURLpath=requestURLpath.substring(0,requestURLpath.lastIndexOf("/"));
        requestURLpath=requestURLpath+"upload/";
        String pathh=requestURLpath+uuid+suffix;
        company.setCphotopath(pathh);
        companyServiceImp.updateCompany(company);

    } catch (Exception e) {
        e.printStackTrace();
    }
    return new ResponseEntity<Company>(company, HttpStatus.OK);
}
    @RequestMapping(value = "/getCompany",method = RequestMethod.POST)
    ResponseEntity<Company> getCompany(HttpSession httpSession){
        User user=(User) httpSession.getAttribute("user");
        Company company=null;
        if(user!=null){
            company=  companyServiceImp.findCompanyByUid(user.getUid());
        }
        return new ResponseEntity<Company>(company,HttpStatus.OK);
    }
}
