package com.sinch.gamehighscore.service.score;

import java.util.List;

import com.sinch.gamehighscore.exceptions.PlayerNotFoundException;
import com.sinch.gamehighscore.exceptions.ScoreNotFoundException;
import com.sinch.gamehighscore.model.Score;

public interface ScoreService {

    List<Score> findByCategory(String name) throws ScoreNotFoundException;

    List<Score> findByPlayer(String name) throws ScoreNotFoundException, PlayerNotFoundException;

    List<Score> findAll() throws ScoreNotFoundException;
    
}
