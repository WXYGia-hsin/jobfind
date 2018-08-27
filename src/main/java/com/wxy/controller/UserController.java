package com.wxy.controller;

import com.wxy.model.User;
import com.wxy.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseEntity<User> login(@RequestBody User user, HttpSession httpSession){
       System.out.println("ddd");
        User u=userServiceImp.login(user.getUsername(),user.getPassword());
        if(u!=null){
            httpSession.setAttribute("user",u);
            return new ResponseEntity<User>(u, HttpStatus.OK);
        }else{
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public ResponseEntity<User> getUser(HttpSession httpSession){
        User u=(User)httpSession.getAttribute("user");
        if(u!=null){
            return new ResponseEntity<User>(u, HttpStatus.OK);
        }else{
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
}
