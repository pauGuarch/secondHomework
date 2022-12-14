package com.ironhack.crm.domain.classes;

import com.ironhack.crm.dao.manager.AccountManager;
import com.ironhack.crm.dao.manager.implementation.*;
import com.ironhack.crm.domain.enums.OpportunityStatus;
import com.ironhack.crm.domain.models.*;
import com.ironhack.crm.controller.CRMController;
import com.ironhack.crm.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CRM {
    private AccountManagerImpl accountManager;

    private ContactManagerImpl contactManager;

    private LeadManagerImpl leadManager;

    private OpportunityManagerImpl opportunityManager;

    private ProductManagerImpl productManager;

    public CRM() {
        accountManager = AccountManagerImpl.getInstance();
        contactManager = ContactManagerImpl.getInstance();
        leadManager = LeadManagerImpl.getInstance();
        opportunityManager = OpportunityManagerImpl.getInstance();
        productManager = ProductManagerImpl.getInstance();
    }

    public void createNewLead(Lead lead){
        leadManager.createNewLead(lead);
    }

    public List<Lead> checkLeads(){
        return leadManager.checkLeads();
    }

    public Lead lookUpLead(UUID leadId){
        return leadManager.lookUpLead(leadId);
    }


    public List<Account> checkAccounts(){
        return accountManager.checkAccounts();
    }


    public void convertLeadToOpportunity(String leadId, Product product, Integer productQuantity,  String accountIndustry,
                                         Integer accountEmployees, String accountCity, String accountCountry){
        Lead lead = leadManager.lookUpLead(UUID.fromString(leadId));
        Contact contact = new Contact(lead.getName(), lead.getEmail(), lead.getPhoneNumber(), lead.getCompanyName());
        Opportunity opportunity = new Opportunity(contact, productQuantity, OpportunityStatus.OPEN, product);
        List <Contact> contacts = new ArrayList<Contact>();
        contacts.add(contact);
        List <Opportunity> opportunities = new ArrayList<Opportunity>();
        opportunities.add(opportunity);
        Account account = new Account(accountIndustry, accountEmployees, accountCity, accountCountry, contacts, opportunities);
        productManager.createProduct(product);
        leadManager.removeLead(UUID.fromString(leadId));
        opportunityManager.createNewOpportunity(opportunity);
        contactManager.createNewContact(contact);
        accountManager.createAccount(account);
    }

    public void editOpportunityStatus(String opportunityId, int status){
        /*List<Opportunity> opportunities = opportunityManager.checkOpportunities();
        for (Opportunity opportunity : opportunities) {
            if (opportunity.getId().toString().equals(opportunityId)){
                opportunity.setStatus(OpportunityStatus.values()[status-1]);
            }
        }*/
        opportunityManager.lookUpOpportunity(UUID.fromString(opportunityId)).setStatus(OpportunityStatus.values()[status - 1]);

        try {
            Utils.writeOpportunityJSON(opportunityManager.getOpportunities());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Opportunity> checkOpportunities(){
        return opportunityManager.checkOpportunities();
    }

    public Opportunity lookUpOpportunity(UUID opportunityId){
        return opportunityManager.lookUpOpportunity(opportunityId);
    }

    public List<Contact> checkContacts(){
        return contactManager.checkContacts();
    }

    public void crateNewContact(Contact contact) {
        contactManager.createNewContact(contact);
    }
}
