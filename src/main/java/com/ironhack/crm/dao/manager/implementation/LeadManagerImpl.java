package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.LeadManager;
import com.ironhack.crm.domain.models.Lead;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import static com.ironhack.crm.utils.Utils.readLeads;

public class LeadManagerImpl implements LeadManager {
    private static LeadManagerImpl leadManager;
    private List<Lead> leads;

    private LeadManagerImpl() {
        this.leads = checkLeads();
    }

    public static LeadManagerImpl getInstance() {
        if (leadManager == null) {
            leadManager = new LeadManagerImpl();
        }
        return leadManager;
    }

    @Override
    public void createNewLead(Lead lead) {

    }

    public List<Lead> checkLeads(){
        return this.leads = readLeads();
    }

    @Override
    public Lead lookUpLead(UUID leadId) {
        return null;
    }

    @Override
    public void removeLead(Lead lead) {

    }
}
