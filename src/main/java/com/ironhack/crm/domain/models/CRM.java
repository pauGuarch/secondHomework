package com.ironhack.crm.domain.models;

import com.ironhack.crm.dao.manager.implementation.AccountManagerImpl;
import com.ironhack.crm.dao.manager.implementation.ContactManagerImpl;
import com.ironhack.crm.dao.manager.implementation.LeadManagerImpl;
import com.ironhack.crm.dao.manager.implementation.OpportunityManagerImpl;
import com.ironhack.crm.domain.enums.OpportunityStatus;

import java.util.List;

public class CRM {
    private AccountManagerImpl accountManager;

    private ContactManagerImpl contactManager;

    private LeadManagerImpl leadManager;

    private OpportunityManagerImpl opportunityManager;

    public Lead createNewLead(){
        return null;
    }

    public void associateOpportunityToAccount(){}

    public List<Lead> trackLeads(){
        return null;
    }


    public List<Lead> checkLeads(){
        return null;
    }

    public Opportunity convertLeadToOpportunity(Lead lead){
        return null;
    }

    public void associateContactToOpportunity(){}

    public void editOpportunityStatus(OpportunityStatus status){}


}
