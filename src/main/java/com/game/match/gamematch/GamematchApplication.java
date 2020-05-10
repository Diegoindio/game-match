package com.game.match.gamematch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.game.match.gamematch.*")
@SpringBootApplication
public class GamematchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamematchApplication.class, args);
	}
}
