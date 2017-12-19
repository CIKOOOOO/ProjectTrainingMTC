package com.example.abedc.projektraining;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by prk on 12/19/2017.
 */

@IgnoreExtraProperties
public class AppModel {
    public String name;
    public String desc;
    public String link;
    public String creator;

    public AppModel() {

    }

    public AppModel(String name, String desc, String link, String creator) {
        this.name = name;
        this.desc = desc;
        this.link = link;
        this.creator = creator;
    }
}
