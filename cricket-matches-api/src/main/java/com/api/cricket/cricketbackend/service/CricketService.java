package com.api.cricket.cricketbackend.service;

import com.api.cricket.cricketbackend.model.currentmatchesmodel.CurrentMatchesResponse;
import com.api.cricket.cricketbackend.model.matchinfomodel.MatchDetailResponse;
import com.api.cricket.cricketbackend.model.playerinfomodel.PlayerInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CricketService {

    @Autowired
    private WebClient webClient;

    @Value("${apikey}")
    private String apikey;

    public CurrentMatchesResponse getCurrentMatchesData(){
        Mono<CurrentMatchesResponse> currentMatchesResponseMono = webClient
                .get()
                .uri("/currentMatches?apikey="+ apikey + "&offset=0")
                .retrieve()
                .bodyToMono(CurrentMatchesResponse.class);

        return currentMatchesResponseMono.block();
    }

    public MatchDetailResponse getMatchDetailById(String match_id){
        Mono<MatchDetailResponse> matchDetailResponseMono = webClient
                .get()
                .uri("/match_info?apikey=" + apikey + "&id=" + match_id)
                .retrieve()
                .bodyToMono(MatchDetailResponse.class);

        return matchDetailResponseMono.block();
    }

}
