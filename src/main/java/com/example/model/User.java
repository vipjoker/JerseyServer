package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Makhobey Oleh on 9/4/15.
 * emai: tajcig@ya.ru
 */


@XmlRootElement
public class User {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
