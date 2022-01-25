
package com.sinch.gamehighscore.repositories.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sinch.gamehighscore.MyApplication;
import com.sinch.gamehighscore.repositories.CategoryRepository;
import com.sinch.gamehighscore.repositories.PlayerRepository;
import com.sinch.gamehighscore.repositories.ScoreRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = MyApplication.class)
public class InitLoadIntegrationTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void testLoadDataForPlayerClass() {
        assertEquals(2, playerRepository.findAll()
            .size());
    }

    @Test
    public void testLoadDataForCategoryClass() {
        assertEquals(6, categoryRepository.findAll()
            .size());
    }

    @Test
    public void testLoadDataForScoreClass() {
        assertEquals(12, scoreRepository.findAll()
            .size());
    }

}