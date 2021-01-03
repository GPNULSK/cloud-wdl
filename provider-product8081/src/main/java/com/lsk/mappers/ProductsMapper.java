package com.lsk.mappers;

import com.lsk.domain.Products;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductsMapper {

    void sellProduct(Products products);

    Products findById(int id);
}