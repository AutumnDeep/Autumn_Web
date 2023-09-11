package com.Autumn.AutumnWeb.service;

import com.Autumn.AutumnWeb.Entity.product;
import com.Autumn.AutumnWeb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<product> productList(){
        return productRepository.findAll();
    }
}
