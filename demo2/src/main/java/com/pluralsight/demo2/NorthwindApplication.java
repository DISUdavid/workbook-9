package com.pluralsight.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NorthwindApplication implements CommandLineRunner {

    ProductDao productDao;
    @Autowired
    public NorthwindApplication(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Product> productList = productDao.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }


}
