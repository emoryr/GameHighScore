package com.sinch.gamehighscore.exceptions;

public class PlayerNotFoundException extends Exception {

    private static final long serialVersionUID = -2586209354700102349L;
	
	public PlayerNotFoundException(){
		super();
	}
	
	public PlayerNotFoundException(String msg){
		super(msg);
	}
	
	public PlayerNotFoundException(String msg, Throwable cause){
		super(msg, cause);
	}
    
}
