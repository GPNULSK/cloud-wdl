package com.lsk.controller;

import com.lsk.domain.Order;

import com.lsk.domain.Products;
import com.lsk.feign.ProductFeignApi;
import com.lsk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 继承公共项目的openFeign接口，当然这也是一个controller
 */
@RestController
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductFeignApi productFeignApi;

    @RequestMapping("/buy")
    public String buy(int pid,int account){
        //Products products = restTemplate.getForObject("http://localhost:8081/sell?id=1&account=5", Products.class);

        Products products = productFeignApi.sell(pid, account);

        System.out.println(products);
        Order order = new Order();
        assert products != null;
        order.setProduceName(products.getProductName());
        order.setAccount(account);

        orderService.createOrder(order);
        return "success";
    }

    @RequestMapping("/test")
    public String test(){
        //Products products = restTemplate.getForObject("http://localhost:8081/sell?id=1&account=5", Products.class);
        return "success";
    }
}
