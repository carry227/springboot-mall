package com.carry.springbootmall.dao;

import com.carry.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
