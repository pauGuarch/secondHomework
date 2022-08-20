package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.OpportunityManager;
import com.ironhack.crm.domain.models.Opportunity;
import java.util.List;
import java.util.UUID;

public class OpportunityManagerImpl implements OpportunityManager {
    private List<Opportunity> opportunities = checkOpportunities();
    @Override
    public void createNewOpportunity(Opportunity lead) {

    }

    @Override
    public List<Opportunity> checkOpportunities() {
        return null;
    }

    @Override
    public Opportunity lookUpOpportunity(UUID opportunityId) {
        return null;
    }
}
