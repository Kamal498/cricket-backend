package com.api.cricket.cricketbackend.model.currentmatchesmodel;

import com.api.cricket.cricketbackend.model.ScoreResponse;
import com.api.cricket.cricketbackend.model.TeamInfo;

import java.util.Arrays;

public class CurrentMatchesResponseData {

    String id;
    String name;
    String matchType;
    String status;
    String venue;
    String date;
    String dateTimeGMT;

    String[] teams;

    TeamInfo[] teamInfo;

    ScoreResponse[] score;

    String series_id;

    public CurrentMatchesResponseData(String id, String name, String matchType, String status, String venue, String date, String dateTimeGMT, String[] teams, TeamInfo[] teamInfo, ScoreResponse[] score, String series_id) {
        this.id = id;
        this.name = name;
        this.matchType = matchType;
        this.status = status;
        this.venue = venue;
        this.date = date;
        this.dateTimeGMT = dateTimeGMT;
        this.teams = teams;
        this.teamInfo = teamInfo;
        this.score = score;
        this.series_id = series_id;
    }

    public CurrentMatchesResponseData() {
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

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateTimeGMT() {
        return dateTimeGMT;
    }

    public void setDateTimeGMT(String dateTimeGMT) {
        this.dateTimeGMT = dateTimeGMT;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public TeamInfo[] getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(TeamInfo[] teamInfo) {
        this.teamInfo = teamInfo;
    }

    public ScoreResponse[] getScore() {
        return score;
    }

    public void setScore(ScoreResponse[] score) {
        this.score = score;
    }

    public String getSeries_id() {
        return series_id;
    }

    public void setSeries_id(String series_id) {
        this.series_id = series_id;
    }

    @Override
    public String toString() {
        return "CurrentMatchesResponseData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", matchType='" + matchType + '\'' +
                ", status='" + status + '\'' +
                ", venue='" + venue + '\'' +
                ", date='" + date + '\'' +
                ", dateTimeGMT='" + dateTimeGMT + '\'' +
                ", teams=" + Arrays.toString(teams) +
                ", teamInfo=" + Arrays.toString(teamInfo) +
                ", score=" + Arrays.toString(score) +
                ", series_id='" + series_id + '\'' +
                '}';
    }
}
