package com.ktjr.ktwd.product.service;

import com.ktjr.ktwd.product.domain.Product;

/**
 * @author vincentchen
 * @date 17/6/12.
 */
public interface ProductService {

    Product findById(String id);
}
