package com.api.cricket.cricketbackend.controller;

import com.api.cricket.cricketbackend.model.currentmatchesmodel.CurrentMatchesResponse;
import com.api.cricket.cricketbackend.model.matchinfomodel.MatchDetailResponse;
import com.api.cricket.cricketbackend.model.playerinfomodel.PlayerInfoResponse;
import com.api.cricket.cricketbackend.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cricket/matches")
public class CricketController {

    @Autowired
    private CricketService service;

    @GetMapping("/test")
    public String test(){
        return "Cricket Matches API Working fine.";
    }

    @GetMapping("/current-matches")
    public CurrentMatchesResponse getCurrentMatchesData(){
        return this.service.getCurrentMatchesData();
    }

    @GetMapping("/match-details/{matchId}")
    public MatchDetailResponse getMatchDetailsById(@PathVariable String matchId){
        return this.service.getMatchDetailById(matchId);
    }

}
