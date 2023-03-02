package com.mygroup.Application.service;

import com.mygroup.Application.domain.dto.ProductDto;

import java.util.List;

public interface ProductService {
     List<ProductDto> findAll();
     ProductDto getProductById(int id);
}
