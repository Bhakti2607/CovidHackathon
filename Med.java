package com.example.covidhackathon;

public class Med {
    private String statename;
    private String institutename;
    private String city;
    private String Type;
    private String admission_capacity;
    private String hosp_beds;

    public Med(String statename, String institutename, String city, String type, String admission_capacity, String hosp_beds) {
        this.statename = statename;
        this.institutename = institutename;
        this.city = city;
        Type = type;
        this.admission_capacity = admission_capacity;
        this.hosp_beds = hosp_beds;
    }

    public Med() {
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAdmission_capacity() {
        return admission_capacity;
    }

    public void setAdmission_capacity(String admission_capacity) {
        this.admission_capacity = admission_capacity;
    }

    public String getHosp_beds() {
        return hosp_beds;
    }

    public void setHosp_beds(String hosp_beds) {
        this.hosp_beds = hosp_beds;
    }
}
