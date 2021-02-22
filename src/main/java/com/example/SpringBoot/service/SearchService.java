package com.example.SpringBoot.service;

import com.example.SpringBoot.dto.SearchRequestDTO;
import com.example.SpringBoot.dto.SearchResponseDTO;

public interface SearchService {
    SearchResponseDTO getProducts(SearchRequestDTO request);
}
