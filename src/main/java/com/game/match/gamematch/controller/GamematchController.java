package com.game.match.gamematch.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.game.match.gamematch.dto.PlayerDto;
import com.game.match.gamematch.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GamematchController {
    @Autowired
    private PlayerServices playerServices;


    @GetMapping(value = "/game-match/players", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPlayers() throws JsonProcessingException {
        List<PlayerDto> result = playerServices.getPlayers();
        return new ObjectMapper().writeValueAsString(result);
    }

    @PostMapping(value = "/game-match/players", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void postPlayers(@RequestBody PlayerDto playerDto) {
        playerServices.postPlayers(playerDto);
    }
}
