package com.shop.app.catalog.service;

import com.shop.app.catalog.clients.ProductServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    ProductServiceFeignClient productServiceApi;

}
