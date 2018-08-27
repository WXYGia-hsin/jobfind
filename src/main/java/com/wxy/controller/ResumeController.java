package com.wxy.controller;

import com.wxy.model.Resume;
import com.wxy.model.User;
import com.wxy.service.ResumeServiceImp;
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
@RequestMapping("/resume")
public class ResumeController {
    private Map<String,String> types=new HashMap<>();
    ResumeController(){
        types.put("image/jpeg", ".jpg");
        types.put("image/gif", ".gif");
        types.put("image/x-ms-bmp", ".bmp");
        types.put("image/png", ".png");
    }
    @Autowired
    ResumeServiceImp resumeServiceImp;
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    ResponseEntity<User> updateResume(@RequestBody Resume resume, HttpSession httpSession){
        User user=(User) httpSession.getAttribute("user");
        Resume resume1=resumeServiceImp.findResumeByUid(user.getUid());
        if(user!=null){
            resume.setPpath(resume1.getPpath());
            resume.setUid(user.getUid());
            resume.setUsername(user.getUsername());
//            resume.setRole(user.getRole());
        }
        resumeServiceImp.updateResume(resume);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @RequestMapping(value = "/getResume",method = RequestMethod.POST)
    ResponseEntity<Resume> getResume(HttpSession httpSession){
        User user=(User) httpSession.getAttribute("user");
        Resume resume=null;
        if(user!=null){
             resume=  resumeServiceImp.findResumeByUid(user.getUid());
        }
        return new ResponseEntity<Resume>(resume,HttpStatus.OK);
    }

    @RequestMapping(value = "/uploadImg",method = RequestMethod.POST)
    public ResponseEntity<Resume> upload(@RequestParam("imgFile") MultipartFile imgFile, HttpServletRequest request, HttpSession httpSession) throws ServletException, IOException {
        String suffix=types.get(imgFile.getContentType());
        Resume resume=null;
        User user=(User) httpSession.getAttribute("user");
        resume=resumeServiceImp.findResumeByUid(user.getUid());
        if(resume==null){
            resume=new Resume();
            resume.setUid(user.getUid());
            resume.setUsername(user.getUsername());
//            resume.setRole(user.getRole());
//            resumeServiceImp.updateResume(resume);
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
            resume.setPpath(pathh);
            resumeServiceImp.updateResume(resume);

        } catch (Exception e) {
                e.printStackTrace();
            }
        return new ResponseEntity<Resume>(resume,HttpStatus.OK);
    }
}
