package com.mygroup.Application.service;

import com.mygroup.Application.domain.Product;
import com.mygroup.Application.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productrepo;
    @Override
    public List<Product> findAll() {
        return productrepo.findAll();
    }
}
