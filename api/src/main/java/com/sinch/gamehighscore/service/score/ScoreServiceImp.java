package com.sinch.gamehighscore.service.score;

import java.util.List;

import com.sinch.gamehighscore.exceptions.PlayerNotFoundException;
import com.sinch.gamehighscore.exceptions.ScoreNotFoundException;
import com.sinch.gamehighscore.model.Category;
import com.sinch.gamehighscore.model.Player;
import com.sinch.gamehighscore.model.Score;
import com.sinch.gamehighscore.repositories.CategoryRepository;
import com.sinch.gamehighscore.repositories.PlayerRepository;
import com.sinch.gamehighscore.repositories.ScoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImp implements ScoreService {
    
    @Autowired
    ScoreRepository scoreRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Score> findByCategory(String name) throws ScoreNotFoundException {
        Category category = categoryRepository.findByName(name);

        if (category == null) {
            throw new ScoreNotFoundException("Could not found the category " + name);
        }
        
        return scoreRepository.findByCategory(category);
    }

    @Override
    public List<Score> findByPlayer(String name) throws ScoreNotFoundException, PlayerNotFoundException {
        
        Player player = playerRepository.findByName(name);

        if (player == null) {
            throw new PlayerNotFoundException("Could not found the player " + name);
        }

        List<Score> scores = scoreRepository.findByPlayer(player);

        if (scores.size() == 0) {
            throw new ScoreNotFoundException("Could not found scores to player " + name);
        }
        
        return scores;
    }

    @Override
    public List<Score> findAll() throws ScoreNotFoundException {
        return scoreRepository.findAll();
    }
    
}
