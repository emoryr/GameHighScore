package com.sinch.gamehighscore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.sinch.gamehighscore.model.Category;
import com.sinch.gamehighscore.model.Player;
import com.sinch.gamehighscore.model.Score;

public interface ScoreRepository extends JpaRepository<Score, Integer> {

    List<Score> findByPlayer(Player player);
    List<Score> findByCategory(Category category);

}
