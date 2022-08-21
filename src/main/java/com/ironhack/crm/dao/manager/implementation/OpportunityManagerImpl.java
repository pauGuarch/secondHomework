package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.OpportunityManager;
import com.ironhack.crm.domain.models.Opportunity;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import static com.ironhack.crm.utils.Utils.readOpportunities;
import static com.ironhack.crm.utils.Utils.writeOpportunityJSON;

public class OpportunityManagerImpl implements OpportunityManager {
    private static OpportunityManagerImpl opportunityManager;
    private List<Opportunity> opportunities;

    private OpportunityManagerImpl() {
        this.opportunities = checkOpportunities();
    }

    public static OpportunityManagerImpl getInstance() {
        if (opportunityManager == null) {
            opportunityManager = new OpportunityManagerImpl();
        }
        return opportunityManager;
    }

    @Override
    public void createNewOpportunity(Opportunity opportunity) {
        opportunities.add(opportunity);
        try {
            writeOpportunityJSON(opportunities);
        } catch (IOException e) {
            e.printStackTrace();
        }
        checkOpportunities();
    }

    @Override
    public List<Opportunity> checkOpportunities() {
        return this.opportunities = readOpportunities();
    }

    @Override
    public Opportunity lookUpOpportunity(UUID opportunityId) {
        return null;
    }

}
