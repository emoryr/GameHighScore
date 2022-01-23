package com.sinch.gamehighscore.controller;

import java.util.ArrayList;
import java.util.List;

import com.sinch.gamehighscore.dto.Response;
import com.sinch.gamehighscore.dto.ScoreDto;
import com.sinch.gamehighscore.exceptions.PlayerNotFoundException;
import com.sinch.gamehighscore.exceptions.ScoreNotFoundException;
import com.sinch.gamehighscore.model.Score;
import com.sinch.gamehighscore.service.score.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/score")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;

	@GetMapping(path="/all")
	public ResponseEntity<Response<List<ScoreDto>>> getAllScore() throws ScoreNotFoundException {
        Response<List<ScoreDto>> response = new Response<>();

		List<Score> scores = scoreService.findAll();

		List<ScoreDto> itemsDTO = new ArrayList<>();
		scores.stream().forEach(score -> itemsDTO.add(score.convertEntityToDTO()));

		response.setData(itemsDTO);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping(path="/player/{name}")
	public ResponseEntity<Response<List<ScoreDto>>> getPlayerScore(@PathVariable String name) throws ScoreNotFoundException, PlayerNotFoundException {
        Response<List<ScoreDto>> response = new Response<>();

		List<Score> scores = scoreService.findByPlayer(name);

		List<ScoreDto> itemsDTO = new ArrayList<>();
		scores.stream().forEach(score -> itemsDTO.add(score.convertEntityToDTO()));

		response.setData(itemsDTO);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping(path="/player/compare/{player1}/{player2}")
	public ResponseEntity<Response<List<ScoreDto>>> getPlayerScore(
		@PathVariable String player1, @PathVariable String player2) throws ScoreNotFoundException, PlayerNotFoundException {
        Response<List<ScoreDto>> response = new Response<>();

		List<Score> scoresPlayer1 = scoreService.findByPlayer(player1);
		List<Score> scoresPlayer2 = scoreService.findByPlayer(player2);

		List<ScoreDto> itemsDTO = new ArrayList<>();
		scoresPlayer1.stream().forEach(score -> itemsDTO.add(score.convertEntityToDTO()));
		scoresPlayer2.stream().forEach(score -> itemsDTO.add(score.convertEntityToDTO()));

		response.setData(itemsDTO);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping(path="/category/{name}")
	public ResponseEntity<Response<List<ScoreDto>>> getCategoryScore(@PathVariable String name) throws ScoreNotFoundException, PlayerNotFoundException {
        Response<List<ScoreDto>> response = new Response<>();

		List<Score> scores = scoreService.findByCategory(name);

		List<ScoreDto> itemsDTO = new ArrayList<>();
		scores.stream().forEach(score -> itemsDTO.add(score.convertEntityToDTO()));

		response.setData(itemsDTO);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
