package com.ironhack.crm.domain.classes;

import com.ironhack.crm.domain.models.Opportunity;

import java.util.ArrayList;

public class UtilsListOpportunity {

    public static void showOpportunities(ArrayList<Opportunity> opportunities) {

        StringBuilder opportunity = new StringBuilder();
        String id = "ID";
        String decisionMaker = "DECISION MAKER";
        String quantity = "QUANTITY";
        String status = "STATUS";
        String product = "PRODUCT";
        System.out.format("%s%55s%31s%24s%32s \n"+"-".repeat(142)+"\n", id, decisionMaker, quantity, status, product);

        for (int i = 0; i < opportunities.size(); i++) {
            System.out.format("%-42s %-28s %-30s %-25s %-12s \n", opportunities.get(i).getId(), opportunities.get(i).getDecisionMaker().getName(), opportunities.get(i).getQuantity(), opportunities.get(i).getStatus(), opportunities.get(i).getProduct());
        }




    }
}
