package com.pluralsight.demo2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    private List<Product> products = new ArrayList<>();


    public SimpleProductDao() {
        products.add(new Product(1,"Kit-Kat", 2.50, "Candy"));
        products.add(new Product(2,"Monkey Wrench",35.50,"Repairs"));
        products.add(new Product(3,"Battery",575.25,"Auto Parts"));
        products.add(new Product(4, "Swiss Army Knife", 225, "Survival"));
    }


    @Override
    public void productAdd(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }



}


