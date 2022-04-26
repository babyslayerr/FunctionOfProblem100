package com.example.functionofproblem100;


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
    @GetMapping("/api/notice")
    public String notice(){

        return "공지사항입니다.";
    }
}
