package com.kennethdudley.interviewtracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;
    @Column(name = "companyName", nullable = false)
    private String companyName;
    @Column(name = "website")
    private String website;
    @Column(name = "location")
    private String location;

    public Company() {
    }

    public Company(Integer companyId, String companyName, String website, String location) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.website = website;
        this.location = location;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
