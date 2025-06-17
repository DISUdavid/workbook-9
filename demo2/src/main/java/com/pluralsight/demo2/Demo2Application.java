package com.pluralsight.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext beanBag = SpringApplication.run(Demo2Application.class, args);
        SimpleProductDao dao = beanBag.getBean(SimpleProductDao.class);


        List<Product> productList = dao.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
