package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.ContactManager;
import com.ironhack.crm.domain.models.Contact;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static com.ironhack.crm.utils.Utils.readContacts;

public class ContactManagerImpl implements ContactManager {
    private static ContactManagerImpl contactManager;
    private List<Contact> contacts;

    private ContactManagerImpl() {
        this.contacts = checkContacts();
    }

    public static ContactManagerImpl getInstance() {
        if (contactManager == null) {
            contactManager = new ContactManagerImpl();
        }
        return contactManager;
    }
    @Override
    public void createNewContact(Contact contact) {

    }

    @Override
    public List<Contact> checkContacts() {
        return this.contacts = readContacts();
    }
}
