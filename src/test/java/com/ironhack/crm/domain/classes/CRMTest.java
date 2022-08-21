package com.ironhack.crm.domain.classes;

import com.ironhack.crm.dao.manager.implementation.LeadManagerImpl;
import com.ironhack.crm.dao.manager.implementation.OpportunityManagerImpl;
import com.ironhack.crm.domain.enums.OpportunityStatus;
import com.ironhack.crm.domain.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CRMTest {

    private CRM crm;
    private Lead lead1;
    private Lead lead2;

    private OpportunityManagerImpl opportunityManager;
    private Contact contact1;
    private Contact contact2;
    private Product product;

    private Opportunity opportunity1;
    private Opportunity opportunity2;

    @BeforeEach
    void setUp() {

        crm = new CRM();
        opportunityManager = OpportunityManagerImpl.getInstance();
        lead1 = new Lead("Silvia", "Fagor", "silviafagor@gmail.com", "677222444");
        lead2 = new Lead("María", "Ikea", "mariavikea@gmail.com", "625888444");
        opportunity1 = new Opportunity(contact1, 40,OpportunityStatus.OPEN, product);
        opportunity2 = new Opportunity(contact2, 10, OpportunityStatus.CLOSED_LOST, product);
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
        Opportunity opportunityId1 = crm.lookUpOpportunity(opportunity1.getId());
        Opportunity opportunityId2 = crm.lookUpOpportunity(opportunity2.getId());
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






}

