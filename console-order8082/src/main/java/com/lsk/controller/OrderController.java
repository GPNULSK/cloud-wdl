package com.lsk.controller;

import com.lsk.domain.Order;

import com.lsk.domain.Products;
import com.lsk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/buy")
    public String buy(int pid,int account){
        Products products = restTemplate.getForObject("http://localhost:8081/sell?id=1&account=5", Products.class);
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