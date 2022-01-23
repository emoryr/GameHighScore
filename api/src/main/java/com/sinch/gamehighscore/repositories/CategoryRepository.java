package com.sinch.gamehighscore.repositories;

import com.sinch.gamehighscore.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByName(String name);

}
