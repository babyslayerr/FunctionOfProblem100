package com.example.functionofproblem100;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public void mainController(){

    }
}
