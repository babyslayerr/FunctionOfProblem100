package com.example.functionofproblem100;


import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @RequestMapping(value = "/hello-spring", method = RequestMethod.GET)
    public String hello_spring(){
        return "hello spring";
    }
}
