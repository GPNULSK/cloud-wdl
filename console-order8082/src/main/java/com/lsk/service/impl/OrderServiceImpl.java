package com.lsk.service.impl;

import com.lsk.domain.Order;
import com.lsk.mappers.OrderDao;
import com.lsk.service.OrderService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public void createOrder(Order order) {
        orderDao.createOrder(order);
    }
}
