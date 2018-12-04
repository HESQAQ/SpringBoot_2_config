package com.example.springboot_2_config.controller;

import com.example.springboot_2_config.dao.ConfigBean;
import com.example.springboot_2_config.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class AnnaController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping(value="/Anna")
    public String say(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }

    @Autowired
    User user;
    @RequestMapping(value="/user")
    public String user(){
        return user.getName()+user.getAge();
    }
}
