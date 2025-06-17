package com.pluralsight.demo2;

import java.util.List;

public interface ProductDao {
    void productAdd(Product product);

    List<Product> getAll();
}
