package com.ironhack.crm.models;

import com.ironhack.crm.enums.OportunityStatus;

import java.util.UUID;

public class Oportunity {
    private UUID id;
    private Contact decisionMaker;
    private int quantity;
    private OportunityStatus status;

    public Oportunity(UUID id, Contact decisionMaker, int quantity, OportunityStatus status) {
        this.id = id;
        this.decisionMaker = decisionMaker;
        this.quantity = quantity;
        this.status = status;
    }

    public Contact getDecisionMaker() {
        return decisionMaker;
    }

    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OportunityStatus getStatus() {
        return status;
    }

    public void setStatus(OportunityStatus status) {
        this.status = status;
    }

    public boolean close(){
        return true;
    }
    public void lookUp(){

    }
}
