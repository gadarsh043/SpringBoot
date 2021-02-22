package com.example.SpringBoot.service.impl;

import com.example.SpringBoot.client.SearchClient;
import com.example.SpringBoot.dto.SearchRequestDTO;
import com.example.SpringBoot.dto.ProductDTO;
import com.example.SpringBoot.dto.SearchResponseDTO;
import com.example.SpringBoot.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchClient searchClient;

    @Override
    public SearchResponseDTO getProducts(SearchRequestDTO request){

        Map<String, Object> productResponse = searchClient.getProducts(request.getSearchTerm());
        List<Map<String, Object>> products = (List<Map<String, Object>>)((Map<String, Object>) productResponse.get("response")).get("docs");
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Map<String, Object> product: products) {
            // parse product into ProductDTO and add into productDTOS list
            ProductDTO productDTO = new ProductDTO();
            productDTO.setDescription((String) product.get("description"));
            productDTO.setTitle((String) product.get("name"));
            productDTO.setSalePrice((Double) product.get("salePrice"));
            int res = (int) product.get("isInStock");
            if(res==1)
            {
                productDTO.setInStock(true);
            }
            else
            {
                productDTO.setInStock(false);
            }
            productDTOS.add(productDTO);
        }
        SearchResponseDTO responseDTO = new SearchResponseDTO();
        responseDTO.setProducts(productDTOS);
        return responseDTO;
    }
}
