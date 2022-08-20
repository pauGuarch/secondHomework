package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.ProductManager;
import com.ironhack.crm.domain.models.Product;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ProductManagerImpl implements ProductManager {
    private List<Product> products = checkProducts();
    @Override
    public List<Product> checkProducts() {
        return null;
    }

    private static void readProduct(List<Product> products) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/product.json"));
            products = new Gson().fromJson(reader, new TypeToken<List<Product>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
