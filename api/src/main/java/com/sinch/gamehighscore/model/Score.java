package com.sinch.gamehighscore.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sinch.gamehighscore.dto.ScoreDto;

@Entity
@Table(name="score")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Score implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY,cascade= CascadeType.ALL)
    @JoinColumn(name = "PLAYER_ID", referencedColumnName="id")
	private Player player;

	@ManyToOne(fetch = FetchType.LAZY,cascade= CascadeType.ALL)
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName="id")
	private Category category;

	private Integer level;

	private Long xp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Long getXp() {
		return xp;
	}

	public void setXp(Long xp) {
		this.xp = xp;
	}

	public ScoreDto convertEntityToDTO() {
		return new ScoreDto(this.getId(), this.player.getName(), this.category.getName(),
		 this.getLevel(), this.getXp());
	}

}