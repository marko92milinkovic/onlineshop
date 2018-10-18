package com.shop.app.productservice.service;

import com.shop.app.productservice.domain.Product;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class ProductService {

    public Stream<Product> getAllProducts() {
        return Stream.of(
                new Product(1l, "isbn1", "Lord of the rings"),
                new Product(2l, "isbn2", "Song of ice and fire"));
    }

}
