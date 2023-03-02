package com.mygroup.Application.service;

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

        return productRepo.findAll().stream().map(p -> modelMapper.map(p, ProductDto.class)).collect(Collectors.toList());
    }
@Override
    public ProductDto getProductById(int id){
        var pr = productRepo
                .findAll()
                .stream().filter(p -> p.getId() == id)
                .findFirst()
                .get();
        return modelMapper.map(pr, ProductDto.class);


}
}
