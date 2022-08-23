package com.ironhack.crm.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.domain.models.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utils {
    public static void lookUpOpportunity(Opportunity opportunity){
        System.out.println(opportunity.toString());
    }

    //Returns the number introduced by the customer within the command. If command is not valid returns 0.
    public static int validateConversionCommand(String command){
        int id = 0;
        try {
            if(command.substring(0, 8).toLowerCase().equals("convert ")){
                String leadId = command.substring(8, command.length());
                try{
                    id = Integer.parseInt(leadId);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                    id =0;
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The command you entered is not valid");
        }finally {
            return id;
        }

    }

    //Returns the number introduced by the customer within the command. If command is not valid returns 0.
    public static int validateLookUpOpportunityCmd(String command){
        int id=0;
        try{
            if(command.substring(0, 19).toLowerCase().equals("lookup opportunity ")){
                String leadId = command.substring(19, command.length());
                try{
                    id = Integer.parseInt(leadId);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                    id = 0;
                }
            }else{
                id = 0;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The command you entered is not valid");
        }finally {
            return id;
        }
    }


    public static List<Opportunity> readOpportunities() {
        List<Opportunity> opportunities = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/opportunity.json"));
            opportunities = new Gson().fromJson(reader, new TypeToken<List<Opportunity>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return opportunities;
    }

    public static List<Contact> readContacts() {
        List<Contact> contacts = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/contact.json"));
            contacts = new Gson().fromJson(reader, new TypeToken<List<Contact>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return contacts;
    }
    public static List<Account> readAccounts() {
        List<Account> accounts = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/account.json"));
            accounts = new Gson().fromJson(reader, new TypeToken<List<Account>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return accounts;
    }
    public static List<Product> readProduct() {
        List<Product> products = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/product.json"));
            products = new Gson().fromJson(reader, new TypeToken<List<Product>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static List<Lead> readLeads() {
        List<Lead> leads = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/lead.json"));
            leads = new Gson().fromJson(reader, new TypeToken<List<Lead>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return leads;
    }
    
    public static void writeAccountsJSON(List<Account> accountList) throws IOException {
        try {
            Writer writer = new FileWriter("./src/main/resources/data/account.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(accountList, writer);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeContactsJSON(List<Contact> contactList) throws IOException {
        try {
            Writer writer = new FileWriter("./src/main/resources/data/contact.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(contactList, writer);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeLeadsJSON(List<Lead> leadList) throws IOException {
        try {
            Writer writer = new FileWriter("./src/main/resources/data/lead.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(leadList, writer);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeOpportunityJSON(List<Opportunity> opportunityList) throws IOException {
        try {
            Writer writer = new FileWriter("./src/main/resources/data/opportunity.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(opportunityList, writer);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void writeProductJSON(List<Product> productList) throws IOException {
        try {
            Writer writer = new FileWriter("./src/main/resources/data/product.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(productList, writer);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
