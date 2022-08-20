package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.ContactManager;
import com.ironhack.crm.domain.models.Contact;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ContactManagerImpl implements ContactManager {
    private List<Contact> contacts = checkContacts();
    @Override
    public void createNewContact(Contact contact) {

    }

    @Override
    public List<Contact> checkContacts() {
        return null;
    }

    private static void readContacts(List<Contact> contacts) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/contact.json"));
            contacts = new Gson().fromJson(reader, new TypeToken<List<Contact>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
