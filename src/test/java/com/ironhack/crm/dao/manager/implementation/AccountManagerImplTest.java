package com.ironhack.crm.dao.manager.implementation;

import com.ironhack.crm.domain.enums.OpportunityStatus;
import com.ironhack.crm.domain.enums.ProductType;
import com.ironhack.crm.domain.models.Account;
import com.ironhack.crm.domain.models.Contact;
import com.ironhack.crm.domain.models.Opportunity;
import com.ironhack.crm.domain.models.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerImplTest {
    private AccountManagerImpl accountManager;
    private Contact contact;
    private List<Contact> contacts;
    private Opportunity opportunity;
    private List<Opportunity> opportunities;
    private Account account1;
    private Account account2;
    private Product product;
    @BeforeEach
    void setUp() {
        accountManager= new AccountManagerImpl();
        contact = new Contact("Manolo", "manolo@gmail", "212512525", "RamonerCompany");

        contacts = new ArrayList<>();
        product = new Product("Samsung Galaxy", ProductType.HYBRID);
        opportunity = new Opportunity(contact,1, OpportunityStatus.OPEN,product);
        opportunities = new ArrayList<>();
        opportunities.add(opportunity);
        contacts.add(contact);
        account1 = new Account("IronHack",11,"dfs","SPAIN",contacts,opportunities);
        account2 = new Account("RamonHack",11,"dfs","Portugal",contacts,opportunities);
    }

    @Test
    void testCreateAndCheckAccount() {
        accountManager.createAccount(account1);
        int index = accountManager.checkAccounts().indexOf(account1);
        assertEquals("IronHack", accountManager.checkAccounts().get(index).getIndustry());
    }

    @Test
    void testCheckAccounts() {
        int accountListSize = accountManager.checkAccounts().size();
        accountManager.createAccount(account1);
        accountManager.createAccount(account2);
        List<Account> accountList = accountManager.checkAccounts();
        assertEquals(accountList.size(), accountListSize + 2);
    }
}