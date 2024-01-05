package com.oracle.dbcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller + @ResponseBody
public class HelloController {

    // if only @controller is used then for api "/hello"
    // we will get internal server error 500

    //if @RestController is used then for api "/hello"
    //string hello is displayed on screen

    //@ResponseBody annotation on a method, Spring converts the return value and writes it to the HTTP response automatically.
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
