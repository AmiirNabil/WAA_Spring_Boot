package com.mygroup.Application.repo;

import com.mygroup.Application.domain.Product;
import com.mygroup.Application.domain.Review;
import com.mygroup.Application.domain.dto.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class ProductRepoImpl implements ProductRepo{

    private static List<Product> products;
    private static int productId = 113;
    static{
products = new ArrayList<>();
Review r1a = new Review(123, "I love it", 5);
Review r1b = new Review(145, "It's ordinary", 4);
List<Review> reviews1 = Arrays.asList(r1a,r1b);

        products = new ArrayList<>();
        Review r2a = new Review(223, "not that good", 2);
        Review r2b = new Review(245, "Itdoes the job", 1);
        List<Review> reviews2 = Arrays.asList(r2a,r2b);

        Product p1 = new Product(111, "Iphone", 1200, reviews1);
        Product p2 = new Product(112, "Macbook", 2000, reviews2);

        products.add(p1);
        products.add(p2);

        }

    @Override
    public List<Product> findAll() {
        return products;
    }


    public void addProduct(Product p){
    p.setId(productId);
    productId++;
    products.add(p);
    }

    public void deleteProduct(int id){
        var deletepr =
        products
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .get();
        products.remove(deletepr);
    }
    public void updateProduct(int id, ProductDto p){
        var upproduct =
        products
        .stream()
        .filter(pr -> pr.getId() == id)
        .findFirst()
        .get();

        upproduct.setName(p.getName());
        upproduct.setPrice(p.getPrice());
    }
}
