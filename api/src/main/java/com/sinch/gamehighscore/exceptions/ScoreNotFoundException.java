package com.sinch.gamehighscore.exceptions;

public class ScoreNotFoundException extends Exception {
    
    private static final long serialVersionUID = -2586209354700102349L;
	
	public ScoreNotFoundException(){
		super();
	}
	
	public ScoreNotFoundException(String msg){
		super(msg);
	}
	
	public ScoreNotFoundException(String msg, Throwable cause){
		super(msg, cause);
	}

}
