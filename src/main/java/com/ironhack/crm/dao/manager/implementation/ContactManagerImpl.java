package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.ContactManager;
import com.ironhack.crm.domain.models.Contact;
import java.io.IOException;
import java.util.List;

import static com.ironhack.crm.utils.Utils.readContacts;
import static com.ironhack.crm.utils.Utils.writeContactsJSON;

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
        contacts.add(contact);
        try {
            writeContactsJSON(contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
        checkContacts();
    }

    @Override
    public List<Contact> checkContacts() {
        return this.contacts = readContacts();
    }
}
