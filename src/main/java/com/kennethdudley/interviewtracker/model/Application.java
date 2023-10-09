package com.kennethdudley.interviewtracker.model;

import jakarta.persistence.*;

enum ApplicationStatus {
    PENDING,
    GHOSTED,
    REJECTED,
    ONLINE_ASSESSMENT,
    INTERVIEW;
}
@Entity
@Table(name = "Application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer applicationId;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "date", nullable = false)
    private String date;
    @Column(name = "application_status", nullable = false)
    private ApplicationStatus applicationStatus;
    @Column(name = "description")
    private String description;

    public Application() {
    }

    public Application(Integer applicationId, String title, String date, ApplicationStatus applicationStatus, String description) {
        this.applicationId = applicationId;
        this.title = title;
        this.date = date;
        this.applicationStatus = applicationStatus;
        this.description = description;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
