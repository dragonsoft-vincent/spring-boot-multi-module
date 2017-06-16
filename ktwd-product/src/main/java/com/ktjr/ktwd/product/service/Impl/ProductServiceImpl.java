package com.ktjr.ktwd.product.service.Impl;

import com.ktjr.ktwd.product.domain.Product;
import com.ktjr.ktwd.product.repository.ProductRepository;
import com.ktjr.ktwd.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vincentchen
 * @date 17/6/12.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findById(String id) {
        return productRepository.findOne(id);
    }
}
