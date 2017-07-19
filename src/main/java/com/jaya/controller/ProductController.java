package com.jaya.controller;

import com.jaya.model.Product;
import com.jaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jnaga1 on 7/18/2017.
 */
@RestController
@RequestMapping( value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @RequestMapping(method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void add(@RequestBody Product product){
        productService.add(product);
    }

    @RequestMapping(value = "/{productId}",method = RequestMethod.GET)
    public Product get(@PathVariable("productId") Integer id){
        return productService.get(id);
    }


}
