package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.ContactManager;
import com.ironhack.crm.domain.models.Contact;

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
}
