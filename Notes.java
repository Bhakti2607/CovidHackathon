package com.example.covidhackathon;

import android.app.Notification;

public class Notes {
    private String date1;
    private String Notification;
    private String link;

    public Notes(String date1, String notification, String link) {
        this.date1 = date1;
        Notification = notification;
        this.link = link;
    }

    public Notes() {
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getNotification() {
        return Notification;
    }

    public void setNotification(String notification) {
        Notification = notification;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
