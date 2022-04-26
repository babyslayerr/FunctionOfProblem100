package com.example.functionofproblem100;

import com.example.functionofproblem100.FunctionOfProblem100Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FunctionOfProblem100Application.class);
    }

}
