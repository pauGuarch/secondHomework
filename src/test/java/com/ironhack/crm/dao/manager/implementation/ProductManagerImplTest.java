package com.ironhack.crm.dao.manager.implementation;

import com.ironhack.crm.domain.enums.ProductType;
import com.ironhack.crm.domain.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerImplTest {
    private Product product1;
    private Product product2;

    private ProductManagerImpl productManager;

    @BeforeEach
    void setUp() {
        product1 = new Product("Samsung Galaxy S22", ProductType.HYBRID);
        product2 = new Product("Samsung Galaxy S22 Ultra", ProductType.BOX);
    }

    @Test
    void testCreateAndCheckProducts() {
        productManager.createProduct(product1);
        int index = productManager.checkProducts().indexOf(product1);
        assertEquals(ProductType.HYBRID, productManager.checkProducts().get(index).getProductType());
    }
}