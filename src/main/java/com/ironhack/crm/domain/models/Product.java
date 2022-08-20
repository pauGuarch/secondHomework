package com.ironhack.crm.domain.models;

import com.ironhack.crm.domain.enums.ProductType;
import com.ironhack.crm.exceptions.EmptyStringException;

import java.util.UUID;

public class Product {

    UUID id;
    private String productName;
    private ProductType productType;

    public Product(String productName, ProductType productType) {
        setId();
        this.productName = productName;
        this.productType = productType;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) throws EmptyStringException {
        if(!productName.isEmpty()){
            this.productName = productName;
        }else {
            throw new EmptyStringException();
        }
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
