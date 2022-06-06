package com.api.cricket.cricketbackend.model.matchinfomodel;

public class MatchDetailResponse {

    MatchDetailResponseData data;

    public MatchDetailResponse() {
    }

    public MatchDetailResponse(MatchDetailResponseData data) {
        this.data = data;
    }

    public MatchDetailResponseData getData() {
        return data;
    }

    public void setData(MatchDetailResponseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MatchDetailResponse{" +
                "data=" + data +
                '}';
    }
}
