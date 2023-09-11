package com.Autumn.AutumnWeb.Controller;

import com.Autumn.AutumnWeb.Entity.product;
import com.Autumn.AutumnWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mainController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/list")
    public List<product> getProductList(){
        return productService.productList();
    }

}
