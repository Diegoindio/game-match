package com.game.match.gamematch.model;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class PlayerEntity {
    @Id
    private long id;
    @Column
    private String name;
}
