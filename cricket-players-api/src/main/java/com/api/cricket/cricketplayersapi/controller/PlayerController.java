package com.api.cricket.cricketplayersapi.controller;

import com.api.cricket.cricketplayersapi.model.Player;
import com.api.cricket.cricketplayersapi.service.PlayerService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cricket/players")
public class PlayerController {

    @Autowired
    PlayerService service;

    @GetMapping("/get/allplayers")
    public List<Player> getAllPlayers(){
        return service.getAllPlayers();
    }

    @GetMapping("/search/byId/{id}")
    public Player searchByPlayerId(@PathVariable String id){
        return service.getPlayerById(id);
    }

    @GetMapping("/search/byName/{name}")
    public List<Player> searchByPlayerName(@PathVariable String name){
        return service.getPlayerByName(name);
    }

    @GetMapping("/search/byRole/{role}")
    public List<Player> searchByPlayerRole(@PathVariable String role){
        return service.getPLayerByRole(role);
    }

    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player){
        return service.addPlayer(player);
    }

    @DeleteMapping("/delete/byId/{id}")
    public Player deletePlayerById(@PathVariable String id){
        return service.deletePlayerById(id);
    }

}
