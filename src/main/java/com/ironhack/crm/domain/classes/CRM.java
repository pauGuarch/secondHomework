package com.ironhack.crm.domain.classes;

import com.ironhack.crm.dao.manager.implementation.*;
import com.ironhack.crm.domain.enums.OpportunityStatus;
import com.ironhack.crm.domain.models.Account;
import com.ironhack.crm.domain.models.Lead;
import com.ironhack.crm.domain.models.Opportunity;

import java.util.List;
import java.util.UUID;

public class CRM {
    private AccountManagerImpl accountManager;

    private ContactManagerImpl contactManager;

    private LeadManagerImpl leadManager;

    private OpportunityManagerImpl opportunityManager;

    private ProductManagerImpl productManager;



    public void createNewLead(Lead lead){

    }

    public List<Lead> checkLeads(){
        return leadManager.checkLeads();
    }

    public Lead lookUpLead(UUID leadId){
        return null;
    }


    public void createAccount(Account account){
        //create Account
    }

    public List<Account> checkAccounts(){
        return null;
    }
    public void convertLeadToOpportunity(String lead_id, Opportunity opportunity){
        //create contact
        //create opportunity
        //associateOpportunityToAccount
        //associateContactToOpportunity
    }

    public void editOpportunityStatus(OpportunityStatus status){}

    public List<Opportunity> checkOpportunities(){
        return null;
    }

    public static void lookUpOpportunity(UUID opportunityId){
        //System.out.println(opportunity.toString());
    }


}
