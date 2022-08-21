package com.ironhack.crm.dao.manager.implementation;

import com.ironhack.crm.domain.models.Account;
import com.ironhack.crm.domain.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerImplTest {
    private Contact contact1;
    private Contact contact2;

    private ContactManagerImpl contactManager;

    @BeforeEach
    void setUp() {
        contact1 = new Contact("Manolo", "manolo@gmail", "212512525", "RamonerCompany");
        contact2 = new Contact("Rubi", "rubi@gmail", "212512525", "RamonerCompany");
    }

    @Test
    void testCreateNewContact() {
        contactManager.createNewContact(contact1);
        int index = contactManager.checkContacts().indexOf(contact1);
        assertEquals("Manolo", contactManager.checkContacts().get(index).getName());
    }

    @Test
    void testCheckContacts() {
        int contactListSize = contactManager.checkContacts().size();
        contactManager.createNewContact(contact1);
        contactManager.createNewContact(contact2);
        List<Contact> contactList = contactManager.checkContacts();
        assertEquals(contactList.size(), contactListSize + 2);
    }
}