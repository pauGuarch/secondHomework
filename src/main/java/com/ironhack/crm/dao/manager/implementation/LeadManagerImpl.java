package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.LeadManager;
import com.ironhack.crm.domain.models.Lead;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import static com.ironhack.crm.utils.Utils.readLeads;
import static com.ironhack.crm.utils.Utils.writeLeadsJSON;

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
        leads.add(lead);
        try {
            writeLeadsJSON(leads);
        } catch (IOException e) {
            e.printStackTrace();
        }
        checkLeads();

    }

    public List<Lead> checkLeads(){
        return this.leads = readLeads();
    }

    @Override
    public Lead lookUpLead(UUID leadId) {
        leads.stream().filter(lead -> lead.getId().equals(leadId));
        return leads.get(0);
    }

    @Override
    public void removeLead(Lead lead) {

    }
}
