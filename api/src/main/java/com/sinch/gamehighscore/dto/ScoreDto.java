package com.sinch.gamehighscore.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScoreDto {

    private Integer id;

    private String name;

    private String category;

    private Integer level;

    private long xp;

    public ScoreDto(Integer id, String name, String category, Integer level, long xp) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.level = level;
        this.xp = xp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public long getXp() {
        return xp;
    }

    public void setXp(long xp) {
        this.xp = xp;
    } 

    
    
}
