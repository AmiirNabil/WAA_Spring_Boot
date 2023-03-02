package com.mygroup.Application.service;

import com.mygroup.Application.domain.Product;
import com.mygroup.Application.domain.Review;
import com.mygroup.Application.domain.dto.ProductDto;
import com.mygroup.Application.repo.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ModelMapper modelMapper;
    @Autowired
 ProductRepo productRepo;

    @Override
    public List<ProductDto> findAll() {

        return productRepo
                .findAll()
                .stream()
                .map(p -> modelMapper.map(p, ProductDto.class))
                .collect(Collectors.toList());
    }
@Override
    public Product getProductById(int id){
    return productRepo.findAll()
                .stream().filter(p -> p.getId() == id)
                .findFirst()
                .get();

}

@Override
public List<Review> getProductDetails(int id){
        return getProductById(id)
                .getReviews();
}

public Review getReviewById(int id, int reviewId){
        return getProductDetails(id)
                .stream()
                .filter(r -> r.getId() == reviewId)
                .findFirst()
                .get();
}
}
