package com.ironhack.crm.utils;

import com.ironhack.crm.domain.models.*;

import java.util.ArrayList;
import java.util.List;

public class UtilsLists {

    public static void showLeads(ArrayList<Lead> leads){
        StringBuilder lead = new StringBuilder();
        String id = "ID";
        String name = "NAME";
        String company = "COMPANY";
        String email = "EMAIL";
        String phoneNumber = "PHONENUMBER";
        System.out.format("%s%43s%31s%24s%32s \n"+"-".repeat(142)+"\n", id,
                name, company, email, phoneNumber);
        for (int i = 0; i < leads.size(); i++) {
            System.out.format("%-40s %-27s %-25s %-25s %-12s \n", leads.get(i).getId().toString(), leads.get(i).getName(),
                    leads.get(i).getCompanyName(), leads.get(i).getEmail(), leads.get(i).getPhoneNumber());
        }
    }
    public static void showOpportunities(List<Opportunity> opportunites){
        for (int i = 0; i < opportunites.size(); i++) {

        }
    }
    public static void showContacts(List<Contact> contacts){
        for (int i = 0; i < contacts.size(); i++) {

        }
    }
    public static void showAccounts(List<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {

        }
    }
    public static void showProducts(List<Product> products){
        for (int i = 0; i < products.size(); i++) {

        }
    }
}
