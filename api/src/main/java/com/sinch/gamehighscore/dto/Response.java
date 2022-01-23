package com.sinch.gamehighscore.dto;

import java.time.LocalDateTime;

public class Response<T> {
    private T data;
	private Object errors;
	
    public void addErrorMsgToResponse(String msgError) {
        ResponseError error = new ResponseError();
		error.setDetails(msgError);
		error.setTimestamp(LocalDateTime.now());
        setErrors(error);
    }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	
}
