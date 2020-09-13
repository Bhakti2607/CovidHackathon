package com.example.covidhackathon;

public class State {
    private String state_name;
    private String cont_no;

    public State(String state_name, String cont_no) {
        this.state_name = state_name;
        this.cont_no = cont_no;
    }

    public State() {
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getCont_no() {
        return cont_no;
    }

    public void setCont_no(String cont_no) {
        this.cont_no = cont_no;
    }
}
