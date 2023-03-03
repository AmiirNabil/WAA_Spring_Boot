package com.mygroup.Application.repo;

import com.mygroup.Application.domain.Product;
import com.mygroup.Application.domain.dto.ProductDto;

import java.util.List;

public interface ProductRepo {

    List<Product> findAll();
    void addProduct(Product p);
    void deleteProduct(int id);
    void updateProduct(int id, ProductDto p);

}
