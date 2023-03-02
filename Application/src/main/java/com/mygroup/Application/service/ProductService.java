package com.mygroup.Application.service;

import com.mygroup.Application.domain.Product;
import com.mygroup.Application.domain.Review;
import com.mygroup.Application.domain.dto.ProductDto;

import java.util.List;

public interface ProductService {
     List<ProductDto> findAll();
     Product getProductById(int id);
     List<Review> getProductDetails(int id);
     Review getReviewById(int id, int reviewId);
}
