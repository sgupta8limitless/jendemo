package com.thorabh.jendemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class MainController {

    @GetMapping
    public List<String> getAllProducts()
    {
        ArrayList products = new ArrayList();

        products.add("Samsug M51");
        products.add("Iphone 14");

        return  products;
    }

}
