package com.mygroup.Application.repo;

import com.mygroup.Application.domain.Product;

import java.util.List;

public interface ProductRepo {

    List<Product> findAll();
}
