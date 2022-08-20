package com.ironhack.crm.domain.models;

import com.ironhack.crm.domain.enums.OpportunityStatus;

import java.util.UUID;

public class Opportunity {
    private UUID id;
    private Contact decisionMaker;
    private Integer quantity;
    private OpportunityStatus status;
    private Product product;
    private Company company;

    public Opportunity(Contact decisionMaker, int quantity, OpportunityStatus status, Product product, int quantity1, Company company) {
        setId();
    }


    public Opportunity(Contact decisionMaker, Integer quantity, OpportunityStatus status, Product product, Company company) {
        setId();
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

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
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
}
