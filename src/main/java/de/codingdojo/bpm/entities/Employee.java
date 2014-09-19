package de.codingdojo.bpm.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
public class Employee {
    private String user;
    private String firstName;
    private String surName;
    private String homeSite;

    @JsonProperty("vorname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("name")
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @JsonProperty("einstellungsort")
    public String getHomeSite() {
        return homeSite;
    }

    public void setHomeSite(String homeSite) {
        this.homeSite = homeSite;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
