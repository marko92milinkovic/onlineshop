package com.shop.app.catalog.clients;

import com.shop.app.catalog.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductServiceFeignClient {

    @GetMapping("/products")
    List<Product> getProducts();

}