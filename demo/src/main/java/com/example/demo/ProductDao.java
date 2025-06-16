package com.example.demo;


import java.util.List;
public interface ProductDao {

    void productAdd(Product product);

    List<Product> getAll();


}
