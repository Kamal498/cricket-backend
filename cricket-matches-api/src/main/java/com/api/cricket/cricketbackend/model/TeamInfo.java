package com.api.cricket.cricketbackend.model;

public class TeamInfo {
    String name;
    String shortname;
    String img;

    public TeamInfo() {
    }

    public TeamInfo(String name, String shortname, String img) {
        this.name = name;
        this.shortname = shortname;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "TeamInfo{" +
                "name='" + name + '\'' +
                ", shortname='" + shortname + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
