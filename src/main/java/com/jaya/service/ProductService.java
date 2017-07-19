package com.jaya.service;

import com.jaya.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jnaga1 on 7/18/2017.
 */
@Service
public class ProductService {

    private static Map<Integer,Product> products = new HashMap<>();
    static {
       Product product = new Product(1,2,"prodId","prodDesc","imageUrl",new BigDecimal(100000));
       products.put(1,product);
    }

    public  List<Product> getProducts(){
        List<Product> list = new ArrayList<>();
      products.forEach((k,v) ->list.add(v));
      return list;
    }

    public void add(Product product){
     products.put(product.getId(),product);
    }

    public Product get(Integer id){
       return products.get(id);
    }

    public void delete(Integer id){
        products.remove(id);
    }
}
