package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.LeadManager;
import com.ironhack.crm.domain.models.Lead;
import java.util.List;
import java.util.UUID;

public class LeadManagerImpl implements LeadManager {
    private List<Lead> leads = checkLeads();
    @Override
    public void createNewLead(Lead lead) {

    }

    public List<Lead> checkLeads(){
        return null;
    }

    @Override
    public Lead lookUpLead(UUID leadId) {
        return null;
    }

    @Override
    public void removeLead(Lead lead) {

    }
}
