package com.ironhack.crm.models;
import java.util.ArrayList;
import java.util.UUID;

public class Contact {
    private UUID id;
    private String name;
    private Integer phoneNumber;
    private String companyName;

    public Contact(UUID id, String name, Integer phoneNumber, String companyName) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Id{" +
                "name='" + name + '\'' +
                ", phoneNumber ='" + '\'' +
                ", email=" +
                ", companyName=" +
                '}';
    }

}
