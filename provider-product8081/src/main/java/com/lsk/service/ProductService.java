package com.lsk.service;

import com.lsk.domain.Products;

public interface ProductService {

    void sellProduct(Products products);

    Products findById(Integer id);
}
