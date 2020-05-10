package com.game.match.gamematch.services;

import com.game.match.gamematch.dto.PlayerDto;

import java.util.List;

public interface PlayerServices {

    public List<PlayerDto> getPlayers();

    public void postPlayers(PlayerDto playerDto);

}
