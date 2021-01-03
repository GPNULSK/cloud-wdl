package com.lsk.service.impl;

import com.lsk.domain.Products;
import com.lsk.mappers.ProductsMapper;
import com.lsk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public void sellProduct(Products products) {

        Products byId = productsMapper.findById(products.getPid());

        Products p = new Products();
        p.setPid(products.getPid());
        p.setInventory(byId.getInventory()-products.getInventory());

        productsMapper.sellProduct(p);
    }

    @Override
    public Products findById(Integer id) {
        return productsMapper.findById(id);
    }
}
