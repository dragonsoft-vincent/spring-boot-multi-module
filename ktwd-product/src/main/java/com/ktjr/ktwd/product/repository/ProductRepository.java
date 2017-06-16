package com.ktjr.ktwd.product.repository;

import com.ktjr.ktwd.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vincentchen
 * @date 17/6/12.
 */
public interface ProductRepository extends JpaRepository<Product, String> {
}
