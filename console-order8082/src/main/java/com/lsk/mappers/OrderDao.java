package com.lsk.mappers;

import com.lsk.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {

    void createOrder(Order order);
}