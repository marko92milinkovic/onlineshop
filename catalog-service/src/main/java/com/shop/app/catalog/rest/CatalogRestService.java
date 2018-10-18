package com.shop.app.catalog.rest;

import com.shop.app.catalog.clients.ProductServiceFeignClient;
import com.shop.app.catalog.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class CatalogRestService {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductServiceFeignClient productApi;


    @Autowired
    private Environment env;

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home() {
        return "Hello from: " + env.getProperty("local.server.port");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/products")
    public Stream<Product> getProducts() {
        return productApi.getProducts().stream();
    }

}
