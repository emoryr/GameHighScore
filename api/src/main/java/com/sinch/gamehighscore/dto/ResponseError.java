package com.sinch.gamehighscore.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

public class ResponseError {
	@NotNull(message="Timestamp cannot be null")
	private LocalDateTime timestamp;
	
	@NotNull(message="Details cannot be null")
    private String details;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	
}
