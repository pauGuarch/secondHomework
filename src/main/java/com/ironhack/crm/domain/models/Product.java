package com.ironhack.crm.domain.models;

import com.ironhack.crm.domain.enums.ProductType;

import java.util.UUID;

public class Product {

    UUID id;
    private ProductType productType;

    public Product(String samsung_galaxy_s22_ultra, ProductType productType) {
        setId();
        this.productType = productType;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }


    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return this.getProductName();
    }
}
