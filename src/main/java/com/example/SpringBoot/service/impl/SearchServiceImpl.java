package com.example.SpringBoot.service.impl;

import com.example.SpringBoot.dto.SearchRequestDTO;
import com.example.SpringBoot.dto.ProductDTO;
import com.example.SpringBoot.dto.SearchResponseDTO;
import com.example.SpringBoot.service.SearchService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SearchServiceImpl implements SearchService {
    @Override
    public SearchResponseDTO getProducts(SearchRequestDTO request){
        SearchResponseDTO responseDTO = new SearchResponseDTO();
        ProductDTO product = new ProductDTO();
        product.setDescription("Samsung galaxy S5 .......");
        product.setTitle("Samsung galaxy S5");
        product.setInStock(true);
        responseDTO.setProducts((Arrays.asList(product)));
        return responseDTO;
    }
}
