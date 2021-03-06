package com.presentation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private String companyName;

    private String logo;

    private String website;

    private String contactPerson;

    @JsonIgnore
    @OneToMany(mappedBy = "companyPresenting", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Presentation> presentations;

    public Set<Presentation> getPresentations() {
        return presentations;
    }

    public void setPresentations(Set<Presentation> presentations) {
        this.presentations = presentations;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
