package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.OpportunityManager;
import com.ironhack.crm.domain.models.Opportunity;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    private static void readOpportunities(List<Opportunity> opportunities) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/opportunity.json"));
            opportunities = new Gson().fromJson(reader, new TypeToken<List<Opportunity>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
