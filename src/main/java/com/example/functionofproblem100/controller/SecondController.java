package com.example.functionofproblem100.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class SecondController {

    @RequestMapping(value = "/hello-spring", method = RequestMethod.GET)
    public String hello_spring(){
        return "hello spring";
    }

    @GetMapping("/hello-rest")
    public String helloRest(){

        return "hello rest";
    }

    @GetMapping("/api/helloworld")
    public String helloRestApi(){

        return "hello rest api";
    }

}
