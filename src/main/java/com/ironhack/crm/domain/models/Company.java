package com.ironhack.crm.domain.models;

public class Company {
    private String industry;
    private int employees;
    private String city;
    private String country;

    public Company(String industry, int employees, String city, String country) {
        this.industry = industry;
        this.employees = employees;
        this.city = city;
        this.country = country;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
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
}
