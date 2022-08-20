package com.ironhack.crm.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.domain.models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
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

    public static boolean validateEmail(String email){
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean validate = false;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if(m.matches()){
            validate=true;
        }
        return validate;
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
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/opportunity.json"));
            contacts = new Gson().fromJson(reader, new TypeToken<List<Opportunity>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return contacts;
    }
    public static List<Account> readAccounts() {
        List<Account> accounts = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/opportunity.json"));
            accounts = new Gson().fromJson(reader, new TypeToken<List<Opportunity>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return accounts;
    }
    public static List<Product> readProduct() {
        List<Product> products = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/opportunity.json"));
            products = new Gson().fromJson(reader, new TypeToken<List<Opportunity>>() {}.getType());
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




}
