package com.ktjr.ktwd.web.controller;

import com.ktjr.ktwd.product.domain.Product;
import com.ktjr.ktwd.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author vincentchen
 * @date 17/6/12.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/findProduct", method = RequestMethod.GET)
    @ResponseBody
    public String findProduct(String id) {
        Product product = productService.findById(id);
        return "find product name is " + product.getProductName();
    }
}
