package com.electronic.store.services;

import com.electronic.store.dtos.PageableResponse;
import com.electronic.store.dtos.ProductDto;

import java.util.List;

public interface ProductService {
    //create
    ProductDto create(ProductDto productDto);
    //update
    ProductDto update(ProductDto productDto, String productId);
    //delete
    void delete(String productId);
    //get single product
    ProductDto get(String productId);
    //get all product
    PageableResponse<ProductDto> getAll(int pageNumber, int pageSize, String sortBy, String sortDir);
    //get all : live
    PageableResponse<ProductDto> getAllLive(int pageNumber, int pageSize, String sortBy, String sortDir);
    //search product
    PageableResponse<ProductDto> searchByTitle(String subTitle, int pageNumber, int pageSize, String sortBy, String sortDir);

    //create product with category
    ProductDto createWithCategory(ProductDto productDto, String categoryId);

    //update category of product
    ProductDto updateCategory(String productId, String categoryId);

    //get all products of category
    PageableResponse<ProductDto> getAllOfCategory(String categoryId,int pageNumber,int pageSize,String sortBy,String sortDir);
}
