package com.lsk.feignClient;

import com.lsk.domain.Products;
import com.lsk.feign.ProductFeignApi;
import com.lsk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductFeign implements ProductFeignApi {

    @Autowired
    private ProductService productService;

    @Override
    public Products sell(Integer id, Integer account) {
        Products products = new Products();
        products.setPid(id);
        products.setInventory(account);

        productService.sellProduct(products);

        return productService.findById(id);
    }
}
