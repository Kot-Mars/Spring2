package com.example.Spring.controller;

import com.example.Spring.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller // UDP
public class ControllerClass {

    ServiceClass serviceClass;

    @Autowired
    public ControllerClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }




    @GetMapping("/")
    public String getFirstString() {
        return "My first string";
    }
    @GetMapping("/")
    public String getStringFromServiceClass() {
        return serviceClass.getStr();
    }
}
