package com.ironhack.crm.domain.classes;

import com.ironhack.crm.domain.models.Product;

import java.util.ArrayList;

public class UtilsListProduct {

    public static void showProducts(ArrayList<Product> products) {

        StringBuilder product = new StringBuilder();
        String id = "ID";
        String productName = "PRODUCT NAME";
        String productType = "PRODUCT TYPE";

        System.out.format("%-43s %-31s %-24s \n"+"-".repeat(142)+"\n", id, productName, productType);

        for (int i = 0; i < products.size(); i++) {

            System.out.format("%-42s %-28s %-30s \n", products.get(i).getId(), products.get(i).getProductName(), products.get(i).getProductType());

        }
    }
}