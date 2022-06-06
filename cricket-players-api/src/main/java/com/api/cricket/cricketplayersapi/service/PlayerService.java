package com.api.cricket.cricketplayersapi.service;

import com.api.cricket.cricketplayersapi.model.Player;
import com.api.cricket.cricketplayersapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public List<Player> getAllPlayers(){
        return repository.findAll();
    }

    public Player getPlayerById(String id){
        return repository.findById(id).get();
    }

    public List<Player> getPlayerByName(String name){
        return repository.findByNameContainingIgnoreCase(name);
    }

    public List<Player> getPLayerByRole(String role) { return repository.findByRoleContainingIgnoreCase(role); }

    public Player addPlayer(Player player){
        return repository.save(player);
    }

    public Player deletePlayerById(String id){
        Player p = getPlayerById(id);
        repository.delete(p);
        return p;
    }


}
