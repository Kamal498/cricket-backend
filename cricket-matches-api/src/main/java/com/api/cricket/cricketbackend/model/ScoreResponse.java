package com.api.cricket.cricketbackend.model;

public class ScoreResponse {

    double r;
    double w;
    double o;
    String inning;

    public ScoreResponse() {
    }

    public ScoreResponse(double r, double w, double o, String inning) {
        this.r = r;
        this.w = w;
        this.o = o;
        this.inning = inning;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getO() {
        return o;
    }

    public void setO(double o) {
        this.o = o;
    }

    public String getInning() {
        return inning;
    }

    public void setInning(String inning) {
        this.inning = inning;
    }

    @Override
    public String toString() {
        return "ScoreResponse{" +
                "r=" + r +
                ", w=" + w +
                ", o=" + o +
                ", inning='" + inning + '\'' +
                '}';
    }
}
