package com.example.SpringBoot.controller;

import com.example.SpringBoot.dto.SearchRequestDTO;
import com.example.SpringBoot.dto.SearchResponseDTO;
import com.example.SpringBoot.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private SearchService searchService;

    @PostMapping(path= "/search")
    public SearchResponseDTO getProducts(@RequestBody SearchRequestDTO request){
        return searchService.getProducts(request);
    }
}
