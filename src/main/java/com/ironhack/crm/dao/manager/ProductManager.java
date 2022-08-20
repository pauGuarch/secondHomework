package com.ironhack.crm.dao.manager;
import com.ironhack.crm.domain.models.Product;
import java.util.List;

public interface ProductManager {
    void createProduct(Product product);
    List<Product> checkProducts();
}
