package com.philips.chatbot.controller;

import com.philips.chatbot.model.Product;
import com.philips.chatbot.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/test")
    public String getHelloWorld() {
        return "hello World";
    }

    @GetMapping("/test/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/test/products/{id}")
    public Optional<Product> findbyID(@PathVariable int id) {
        return productRepository.findById(id);
    }

}
