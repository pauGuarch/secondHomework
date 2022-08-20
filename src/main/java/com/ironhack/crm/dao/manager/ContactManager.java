package com.ironhack.crm.dao.manager;
import com.ironhack.crm.domain.models.Contact;
import java.util.List;

public interface ContactManager {
    void createNewContact(Contact contact);
    List<Contact> checkContacts();
}
