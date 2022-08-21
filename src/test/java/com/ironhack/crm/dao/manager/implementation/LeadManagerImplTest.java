package com.ironhack.crm.dao.manager.implementation;

import com.ironhack.crm.domain.models.Lead;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeadManagerImplTest {
    private Lead lead1;
    private Lead lead2;

    private LeadManagerImpl leadManager;

    @BeforeEach
    void setUp() {
        lead1 = new Lead("Julian", "Ironhack", "juli@gjasof.com", "125252152");
        lead2 = new Lead("Ramona", "Ironhack", "Ramona@gjasof.com", "125125252152");
    }

    @Test
    void testCreateNewLeadAndCheckLeads(){
        leadManager.createNewLead(lead1);
        int index = leadManager.checkLeads().indexOf(lead1);
        assertEquals("juli@gjasof.com", leadManager.checkLeads().get(index).getEmail());
    }

    @Test
    void testLookUpLead(){
        leadManager.createNewLead(lead2);
        Lead lookedLead = leadManager.lookUpLead(lead2.getId());
        assertEquals("125125252152", lookedLead.getPhoneNumber());
    }

    @Test
    void testRemoveLead(){
        leadManager.createNewLead(lead1);
        leadManager.removeLead(lead1);
        assertEquals(leadManager.checkLeads().indexOf(lead1), -1);
    }
}