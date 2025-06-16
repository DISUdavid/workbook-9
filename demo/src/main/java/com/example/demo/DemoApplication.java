package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext beanBag = SpringApplication.run(DemoApplication.class, args);
        ProductDao dao = beanBag.getBean(SimpleProductDao.class);
        //dao.getAll();

//        List<Product> productList = dao.getAll();
//        for (Product product: productList){
//            System.out.println(product);
//        }
    }

}
