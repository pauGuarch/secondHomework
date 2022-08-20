package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.LeadManager;
import com.ironhack.crm.domain.models.Lead;
import com.ironhack.crm.domain.models.Product;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    private static void readLead(List<Lead> leads) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/lead.json"));
            leads = new Gson().fromJson(reader, new TypeToken<List<Lead>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
