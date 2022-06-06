package com.api.cricket.cricketbackend.model.playerinfomodel;

import java.util.Arrays;

public class PlayerInfoResponse {
    String id;
    String name;
    String dateOfBirth;
    String role;
    String battingStyle;
    String bowlingStyle;
    String placeOfBirth;
    String country;
    String playerImg;

    PlayerStats[] stats;

    public PlayerInfoResponse() {
    }

    public PlayerInfoResponse(String id, String name, String dateOfBirth, String role, String battingStyle, String bowlingStyle, String placeOfBirth, String country, String playerImg, PlayerStats[] stats) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.placeOfBirth = placeOfBirth;
        this.country = country;
        this.playerImg = playerImg;
        this.stats = stats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    public void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlayerImg() {
        return playerImg;
    }

    public void setPlayerImg(String playerImg) {
        this.playerImg = playerImg;
    }

    public PlayerStats[] getStats() {
        return stats;
    }

    public void setStats(PlayerStats[] stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "PlayerInfoResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", role='" + role + '\'' +
                ", battingStyle='" + battingStyle + '\'' +
                ", bowlingStyle='" + bowlingStyle + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", country='" + country + '\'' +
                ", playerImg='" + playerImg + '\'' +
                ", stats=" + Arrays.toString(stats) +
                '}';
    }
}
