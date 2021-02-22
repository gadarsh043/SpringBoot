package com.example.SpringBoot.controller;

import com.example.SpringBoot.dto.MyRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class MyController {
    @PostMapping(path= "/search")
    public String registerValue(@RequestBody MyRequestDTO request){
        return request.toString();
    }

}
