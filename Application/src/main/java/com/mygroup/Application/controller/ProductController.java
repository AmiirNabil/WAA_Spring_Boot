package com.mygroup.Application.controller;

import com.mygroup.Application.domain.Product;
import com.mygroup.Application.domain.dto.ProductDto;
import com.mygroup.Application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
@Autowired
    ProductService productService;
@GetMapping()
    public List<ProductDto> getAll(){
        return  productService.findAll();
    }
}
