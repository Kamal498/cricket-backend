package com.api.cricket.cricketbackend.model.playerinfomodel;

public class PlayerStats {
    String fn;
    String matchtype;
    String stat;
    double value;

    public PlayerStats() {
    }

    public PlayerStats(String fn, String matchtype, String stat, double value) {
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "fn='" + fn + '\'' +
                ", matchtype='" + matchtype + '\'' +
                ", stat='" + stat + '\'' +
                ", value=" + value +
                '}';
    }
}
