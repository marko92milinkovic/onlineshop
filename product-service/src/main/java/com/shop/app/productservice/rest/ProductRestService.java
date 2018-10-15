package com.shop.app.productservice.rest;

import com.shop.app.productservice.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class ProductRestService {

    @Autowired
    private Environment env;


    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public Stream<Product> getProducts() {
        System.out.println("I am beeing called");
        return Stream.of(
                new Product(1l, "isbn1", "Lord of the rings"),
                new Product(2l, "isbn2", "Song of ice and fire"));
    }
}
