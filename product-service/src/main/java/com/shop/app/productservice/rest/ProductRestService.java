package com.shop.app.productservice.rest;

import com.netflix.discovery.converters.Auto;
import com.shop.app.productservice.config.ProductAppConfiguration;
import com.shop.app.productservice.domain.Product;
import com.shop.app.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class ProductRestService {

    @Autowired
    private Environment env;

    @Autowired
    ProductAppConfiguration configuration;

    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public Stream<Product> getProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/conf-property")
    public Optional<String> getConfigProperty() {
        return Optional.ofNullable(configuration.getProperty());
    }
}
