package com.example.functionofproblem100.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


    @ResponseBody
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String mainController(){

        return "hello world";

    }
}
