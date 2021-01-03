package com.lsk.controller;

import com.lsk.domain.Products;
import com.lsk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/sell")
    public Products sell(Integer id,Integer account){
        Products products = new Products();
        products.setPid(id);
        products.setInventory(account);

        productService.sellProduct(products);

        return productService.findById(id);
    }
}
