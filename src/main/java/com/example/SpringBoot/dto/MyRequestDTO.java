package com.example.SpringBoot.dto;

public class MyRequestDTO {
    private String searchTerm;

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String toString() {
        return "searchTerm='" + searchTerm + '\'' +
                '}';
    }
}
