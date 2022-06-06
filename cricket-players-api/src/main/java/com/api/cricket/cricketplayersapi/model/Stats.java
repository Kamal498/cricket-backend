package com.api.cricket.cricketplayersapi.model;


public class Stats {

    private String fn;
    private String matchtype;
    private String stat;
    private String value;

    public Stats() {
    }

    public Stats(String fn, String matchtype, String stat, String value) {
        this.fn = fn;
        this.matchtype = matchtype;
        this.stat = stat;
        this.value = value;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getMatchtype() {
        return matchtype;
    }

    public void setMatchtype(String matchtype) {
        this.matchtype = matchtype;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "fn='" + fn + '\'' +
                ", matchtype='" + matchtype + '\'' +
                ", stat='" + stat + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
