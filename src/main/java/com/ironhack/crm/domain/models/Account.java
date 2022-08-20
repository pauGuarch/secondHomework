package com.ironhack.crm.domain.models;


import java.util.ArrayList;
import java.util.UUID;

public class Account {

    private UUID id;
    private String industry;
    private Integer employeeCount;
    private String city;
    private String country;
    private ArrayList<String> contactList;
    private ArrayList<String> opportunityList;


    public Account(String industry, Integer employeeCount, String city, String country, ArrayList<String> contactList, ArrayList<String> opportunityList) {
        setId();
        this.industry = industry;
        this.employeeCount = employeeCount;
        this.city = city;
        this.country = country;
        this.contactList = contactList;
        this.opportunityList = opportunityList;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<String> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<String> contactList) {
        this.contactList = contactList;
    }

    public ArrayList<String> getOpportunityList() {
        return opportunityList;
    }

    public void setOpportunityList(ArrayList<String> opportunityList) {
        this.opportunityList = opportunityList;
    }
}
