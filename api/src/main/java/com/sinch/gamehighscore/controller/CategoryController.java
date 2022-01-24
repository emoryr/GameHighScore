package com.sinch.gamehighscore.controller;

import java.util.ArrayList;
import java.util.List;

import com.sinch.gamehighscore.dto.CategoryDto;
import com.sinch.gamehighscore.dto.Response;
import com.sinch.gamehighscore.exceptions.ScoreNotFoundException;
import com.sinch.gamehighscore.model.Category;
import com.sinch.gamehighscore.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping(path="/all")
	public ResponseEntity<Response<List<CategoryDto>>> getAllCategory() throws ScoreNotFoundException {
        Response<List<CategoryDto>> response = new Response<>();

		List<Category> categories = categoryRepository.findAll();

		List<CategoryDto> itemsDTO = new ArrayList<>();
		categories.stream().forEach(category -> itemsDTO.add(category.convertEntityToDTO()));

		response.setData(itemsDTO);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
