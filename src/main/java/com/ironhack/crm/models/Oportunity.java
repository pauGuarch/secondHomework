package com.ironhack.crm.models;

import com.ironhack.crm.enums.OportunityStatus;

import java.util.UUID;

public class Oportunity {
    private UUID id;
    private Contact decisionMaker;
    private int quantity;
    private OportunityStatus status;
    private String product;
    private int quantity;
    private Company company;

    public Oportunity(UUID id, Contact decisionMaker, int quantity, OportunityStatus status, String product, int quantity1, Company company) {


    public Oportunity(UUID id, Contact decisionMaker, int quantity, OportunityStatus status) {
        this.id = id;
        this.decisionMaker = decisionMaker;
        this.quantity = quantity;
        this.status = status;
        this.product = product;
        this.quantity = quantity1;
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

    public OportunityStatus getStatus() {
        return status;
    }

    public void setStatus(OportunityStatus status) {
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

    public boolean close(OportunityStatus status){
        if (status == OportunityStatus.CLOSED_LOST || status == OportunityStatus.CLOSED_WON){
            setStatus(status);
            return true;
        }else{
            return false;
        }
    public boolean close(){
        return true;
    }
    public void lookUp(){

    }
}
