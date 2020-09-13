package com.example.covidhackathon;

import java.security.SecureRandom;

public class Dash {
    private String satename;
    private String ruralHosp;
    private String ruralbeds;
    private String urbanHosp;
    private String urbanBeds;
    private String totalHosp;
    private String totalBeds;

    public Dash(String satename, String ruralHosp, String ruralbeds, String urbanHosp, String urbanBeds, String totalHosp, String totalBeds) {
        this.satename = satename;
        this.ruralHosp = ruralHosp;
        this.ruralbeds = ruralbeds;
        this.urbanHosp = urbanHosp;
        this.urbanBeds = urbanBeds;
        this.totalHosp = totalHosp;
        this.totalBeds = totalBeds;
    }

    public Dash() {
    }

    public String getSatename() {
        return satename;
    }

    public void setSatename(String satename) {
        this.satename = satename;
    }

    public String getRuralHosp() {
        return ruralHosp;
    }

    public void setRuralHosp(String ruralHosp) {
        this.ruralHosp = ruralHosp;
    }

    public String getRuralbeds() {
        return ruralbeds;
    }

    public void setRuralbeds(String ruralbeds) {
        this.ruralbeds = ruralbeds;
    }

    public String getUrbanHosp() {
        return urbanHosp;
    }

    public void setUrbanHosp(String urbanHosp) {
        this.urbanHosp = urbanHosp;
    }

    public String getUrbanBeds() {
        return urbanBeds;
    }

    public void setUrbanBeds(String urbanBeds) {
        this.urbanBeds = urbanBeds;
    }

    public String getTotalHosp() {
        return totalHosp;
    }

    public void setTotalHosp(String totalHosp) {
        this.totalHosp = totalHosp;
    }

    public String getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(String totalBeds) {
        this.totalBeds = totalBeds;
    }
}
