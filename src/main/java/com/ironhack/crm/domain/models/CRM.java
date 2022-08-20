package com.ironhack.crm.domain.models;

import com.ironhack.crm.dao.manager.implementation.AccountManagerImpl;
import com.ironhack.crm.dao.manager.implementation.ContactManagerImpl;
import com.ironhack.crm.dao.manager.implementation.LeadManagerImpl;
import com.ironhack.crm.dao.manager.implementation.OpportunityManagerImpl;
import com.ironhack.crm.domain.enums.OpportunityStatus;

import java.util.List;
import java.util.UUID;

public class CRM {
    private AccountManagerImpl accountManager;

    private ContactManagerImpl contactManager;

    private LeadManagerImpl leadManager;

    private OpportunityManagerImpl opportunityManager;

    public void createNewLead(Lead lead){

    }


    public void associateOpportunityToAccount(){}


    public List<Lead> checkLeads(){
        return leadManager.checkLeads();
    }

    public Lead lookUpLead(UUID leadId){
        return null;
    }

    public void convertLeadToOpportunity(Lead lead){
    }

    public void associateContactToOpportunity(){}

    public void editOpportunityStatus(OpportunityStatus status){}

    public List<Opportunity> checkOpportunities(){
        return null;
    }

    public static void lookUpOpportunity(UUID opportunityId){
        //System.out.println(opportunity.toString());
    }
}
