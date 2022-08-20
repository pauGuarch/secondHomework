package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.ProductManager;
import com.ironhack.crm.domain.models.Product;
import java.util.List;

import static com.ironhack.crm.utils.Utils.readProduct;

public class ProductManagerImpl implements ProductManager {
    private static ProductManagerImpl productManager;
    private List<Product> products;

    private ProductManagerImpl() {
        this.products = checkProducts();
    }

    public static ProductManagerImpl getInstance() {
        if (productManager == null) {
            productManager = new ProductManagerImpl();
        }
        return productManager;
    }

    @Override
    public List<Product> checkProducts() {
        return this.products = readProduct();
    }

}
