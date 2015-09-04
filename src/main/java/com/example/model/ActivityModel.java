package com.example.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Makhobey Oleh on 9/3/15.
 * emai: tajcig@ya.ru
 */

@XmlRootElement(name = "act")
public class ActivityModel {



    public ActivityModel(){}


    private String description;
    private int duration;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @XmlElement(name = "desc")
    public String getDescription() {
        return description;
    }
    @XmlElement (name = "dur")
    public int getDuration() {
        return duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
