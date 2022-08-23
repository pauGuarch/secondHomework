package com.ironhack.crm.domain.classes;

import com.ironhack.crm.domain.models.Contact;

import java.util.ArrayList;

public class UtilsListContact {

    public static void showContacts(ArrayList<Contact> contacts) {

        StringBuilder contact = new StringBuilder();
        String id = "ID";
        String name = "NAME";
        String email = "EMAIL";
        String phoneNumber = "PHONE NUMBER";
        String companyName = "COMPANY NAME";

        System.out.format("%s%43s%31s%24s%32s \n"+"-".repeat(142)+"\n", id, name, email, phoneNumber, companyName);

        for (int i = 0; i < contacts.size(); i++) {
            System.out.format("%-42s %-28s %-30s %-25s %-12s \n", contacts.get(i).getId(), contacts.get(i).getName(), contacts.get(i).getEmail(), contacts.get(i).getPhoneNumber(), contacts.get(i).getCompanyName());
        }

    }
}
