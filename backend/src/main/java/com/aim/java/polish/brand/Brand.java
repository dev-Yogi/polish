package com.aim.java.polish.brand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private int id;
    @Column(name = "brand_name")
    private String name;
    @Column(name = "vegan")
    private boolean vegan;
    @Column(name = "cruelty_free")
    private boolean crueltyFree;
    @Column(name = "website")
    private String website;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isCrueltyFree() {
        return crueltyFree;
    }

    public void setCrueltyFree(boolean crueltyFree) {
        this.crueltyFree = crueltyFree;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }




    
}
