package com.mym.springboot.springbootbasis.quickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String hello(){
        return "hello spring boot!";
    }

}
