package com.aim.java.polish.polish;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "polishes")
public class Polish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "polish_id")
    private int id;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "polish_name")
    private String polishName;
    @Column(name = "color1")
    private String color1;
    @Column(name = "color2")
    private String color2;
    @Column(name = "color3")
    private String color3;
    @Column(name = "finish1")
    private String finish1;
    @Column(name = "finish2")
    private String finish2;
    @Column(name = "finish3")
    private String finish3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPolishName() {
        return polishName;
    }

    public void setPolishName(String polishName) {
        this.polishName = polishName;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getColor3() {
        return color3;
    }

    public void setColor3(String color3) {
        this.color3 = color3;
    }

    public String getFinish1() {
        return finish1;
    }

    public void setFinish1(String finish1) {
        this.finish1 = finish1;
    }

    public String getFinish2() {
        return finish2;
    }

    public void setFinish2(String finish2) {
        this.finish2 = finish2;
    }

    public String getFinish3() {
        return finish3;
    }

    public void setFinish3(String finish3) {
        this.finish3 = finish3;
    }

    
}
