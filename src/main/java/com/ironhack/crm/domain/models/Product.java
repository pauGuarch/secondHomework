package com.ironhack.crm.domain.models;

import com.ironhack.crm.domain.enums.ProductType;

import java.util.UUID;

public class Product {

    UUID uuid = UUID.randomUUID();
    private String productName;
    private ProductType productType;

    public Product(UUID uuid, String productName, ProductType productType) {
        this.uuid = uuid;
        this.productName = productName;
        this.productType = productType;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
