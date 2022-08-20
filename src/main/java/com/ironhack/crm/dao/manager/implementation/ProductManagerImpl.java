package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.ProductManager;
import com.ironhack.crm.domain.models.Product;

import java.util.List;

public class ProductManagerImpl implements ProductManager {
    private List<Product> products = checkProducts();
    @Override
    public List<Product> checkProducts() {
        return null;
    }
}
