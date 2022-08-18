package com.ironhack.crm.models;

import java.util.ArrayList;
import java.util.UUID;

public class Account {

    UUID uuid = UUID.randomUUID();
    private String industry;
    private int employeeCount;
    private String city;
    private String country;
    private ArrayList<String> contactList;
    private ArrayList<String> oportunityList;


    public Account(String industry, int employeeCount, String city, String country, ArrayList<String> contactList, ArrayList<String> oportunityList) {
        this.industry = industry;
        this.employeeCount = employeeCount;
        this.city = city;
        this.country = country;
        this.contactList = contactList;
        this.oportunityList = oportunityList;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
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

    public ArrayList<String> getOportunityList() {
        return oportunityList;
    }

    public void setOportunityList(ArrayList<String> oportunityList) {
        this.oportunityList = oportunityList;
    }
}
