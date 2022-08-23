package com.ironhack.crm.domain.classes;
import com.ironhack.crm.dao.manager.implementation.ContactManagerImpl;
import com.ironhack.crm.dao.manager.implementation.OpportunityManagerImpl;
import com.ironhack.crm.domain.enums.OpportunityStatus;
import com.ironhack.crm.domain.enums.ProductType;
import com.ironhack.crm.domain.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class CRMTest {

    private CRM crm;
    private Lead lead1;
    private Lead lead2;

    private ContactManagerImpl contactManager;

    private OpportunityManagerImpl opportunityManager;
    private Contact contact1;
    private Contact contact2;
    private Product product;
    private Product product1;

    private Opportunity opportunity1;
    private Opportunity opportunity2;

    @BeforeEach
    void setUp() {

        crm = new CRM();
        opportunityManager = OpportunityManagerImpl.getInstance();
        contactManager = ContactManagerImpl.getInstance();
        lead1 = new Lead("Silvia", "Fagor", "silviafagor@gmail.com", "677222444");
        lead2 = new Lead("María", "Ikea", "mariavikea@gmail.com", "625888444");
        opportunity1 = new Opportunity(contact1, 40,OpportunityStatus.OPEN, product);
        opportunity2 = new Opportunity(contact2, 10, OpportunityStatus.CLOSED_LOST, product);
        product1 = new Product("Samsung Galaxy S22", ProductType.HYBRID);
        crm.createNewLead(lead1);
        crm.createNewLead(lead2);
        opportunityManager.createNewOpportunity(opportunity1);
        opportunityManager.createNewOpportunity(opportunity2);
    }


    @Test
    void lookUpLeadTest() {

        Lead leadId1 = crm.lookUpLead(lead1.getId());
        Lead leadId2 = crm.lookUpLead(lead2.getId());
        assertEquals(lead1.getId(), leadId1.getId());
        assertEquals(lead2.getId(), leadId2.getId());
    }

    @Test
    void lookUpOpportunityTest() {
        Opportunity opportunityId1 = crm.lookUpOpportunity(opportunity1.getId().toString());
        Opportunity opportunityId2 = crm.lookUpOpportunity(opportunity2.getId().toString());
        assertEquals(opportunity1.getId(), opportunityId1.getId());
        assertEquals(opportunity2.getId(), opportunityId2.getId());
    }

    @Test
    void editOpportunityStatusToClosedWonTest() {
        crm.editOpportunityStatus(opportunity1.getId().toString(), OpportunityStatus.CLOSED_WON);
        assertEquals(opportunity1.getStatus(), OpportunityStatus.CLOSED_WON);
    }

    @Test
    void editOpportunityStatusToClosedLostTest() {
        crm.editOpportunityStatus(opportunity1.getId().toString(), OpportunityStatus.CLOSED_LOST);
        assertEquals(opportunity1.getStatus(), OpportunityStatus.CLOSED_LOST);
    }

   /* @Test
    void convertLeadToOpportunityTest() {
        Lead leadToConvert = crm.lookUpLead(lead1.getId());
        crm.convertLeadToOpportunity(lead1.getId().toString(), product1, 2, "ES000222", 002, "0023", "001");
        contactManager.checkContacts().stream().filter(contact -> contact.getName() == leadToConvert.getName() && contact.getCompanyName() == leadToConvert.getCompanyName());

        if (leadToConvert.) {
            contact1 = new Contact(leadToConvert.getName(), leadToConvert.getEmail(), leadToConvert.getPhoneNumber(), leadToConvert.getCompanyName());

        }

        assertEquals(leadToConvert.getName(), opportunityManager.checkOpportunities());
    } */


}
