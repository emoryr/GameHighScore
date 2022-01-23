package com.sinch.gamehighscore.repositories;

import com.sinch.gamehighscore.model.Player;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findByName(String name);

}
