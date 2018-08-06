package com.mym.springboot.springbootbasis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private Person person;

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return person;
    }

}
