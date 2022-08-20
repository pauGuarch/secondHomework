package com.ironhack.crm.domain.models;

import com.ironhack.crm.domain.enums.OpportunityStatus;

import java.util.UUID;

public class Opportunity {
    private UUID id;
    private Contact decisionMaker;
    private int quantity;
    private OpportunityStatus status;
    private String product;
    private Company company;

    public Opportunity(UUID id, Contact decisionMaker, int quantity, OpportunityStatus status, String product, int quantity1, Company company) {
    }


    public Opportunity(UUID id, Contact decisionMaker, int quantity, OpportunityStatus status) {
        this.id = id;
        this.decisionMaker = decisionMaker;
        this.quantity = quantity;
        this.status = status;
        this.product = product;
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public OpportunityStatus getStatus() {
        return status;
    }

    public void setStatus(OpportunityStatus status) {
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public boolean close(OpportunityStatus status){
        if (status == OpportunityStatus.CLOSED_LOST || status == OpportunityStatus.CLOSED_WON){
            setStatus(status);
            return true;
        }else{
            return false;
        }
    }
    public boolean close(){
        return true;
    }
    public void lookUp(){

    }
}
