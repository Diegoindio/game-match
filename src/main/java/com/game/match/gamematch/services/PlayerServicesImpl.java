package com.game.match.gamematch.services;

import com.game.match.gamematch.dto.PlayerDto;
import com.game.match.gamematch.model.PlayerEntity;
import com.game.match.gamematch.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PlayerServicesImpl implements PlayerServices {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<PlayerDto> getPlayers() {

        List<PlayerEntity> listPlayerEntinty =  playerRepository.findAll();
        List<PlayerDto> playerDtoList = new ArrayList<>();

        for (int i = 0; i < listPlayerEntinty.size(); i++){
            PlayerEntity p = listPlayerEntinty.get(i);
            PlayerDto playerDto = new PlayerDto();
            playerDto.setName(p.getName());
            playerDtoList.add(playerDto);
        }
        return playerDtoList;

        /*List<PlayerDto> playersList = new ArrayList<>();
        playersList.add( new PlayerDto("Diego"));
        playersList.add( new PlayerDto("Kildare"));
        playersList.add( new PlayerDto("Andrew"));

        return playersList;

         */
    }
    @Override
    public void postPlayers(PlayerDto playerDto){
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setName(playerDto.getName());
        playerRepository.save(playerEntity);
    }
}
