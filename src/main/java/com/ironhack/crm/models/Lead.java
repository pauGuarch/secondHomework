package com.ironhack.crm.models;

import java.util.List;
import java.util.UUID;

public class Lead {
    private UUID id;
    private String name;
    private String companyName;
    private String email;
    private String phoneNumber;

    public Lead(String name, String companyName, String email, String phoneNumber) {
        this.name = name;
        this.companyName = companyName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
