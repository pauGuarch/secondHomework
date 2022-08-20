package com.ironhack.crm.domain.models;


import com.ironhack.crm.exceptions.EmptyStringException;
import com.ironhack.crm.exceptions.IntegerException;

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

    public void setIndustry(String industry) throws EmptyStringException {
        if(!industry.isEmpty()){
            this.industry = industry;
        }else {
            throw new EmptyStringException();
        }
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) throws IntegerException {
        if(employeeCount > 0){
            this.employeeCount = employeeCount;
        }else {
            throw new IntegerException();
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws EmptyStringException {
        if(!city.isEmpty()){
            this.city = city;
        }else {
            throw new EmptyStringException();
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) throws EmptyStringException {
        if(!country.isEmpty()){
            this.country = country;
        }else {
            throw new EmptyStringException();
        }
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
