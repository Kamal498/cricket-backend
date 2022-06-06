package com.api.cricket.cricketbackend.model.currentmatchesmodel;

import java.util.Arrays;

public class CurrentMatchesResponse {

    CurrentMatchesResponseData[] data;

    public CurrentMatchesResponse() {
    }

    public CurrentMatchesResponse(String apikey, CurrentMatchesResponseData[] data) {
        this.data = data;
    }

    public CurrentMatchesResponseData[] getData() {
        return data;
    }

    public void setData(CurrentMatchesResponseData[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CurrentMatchesResponse{" +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
