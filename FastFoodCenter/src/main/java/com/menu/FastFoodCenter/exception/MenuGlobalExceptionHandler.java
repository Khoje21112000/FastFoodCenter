package com.menu.FastFoodCenter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MenuGlobalExceptionHandler {

	@ExceptionHandler(MenuException.class)
	public ResponseEntity<ErrorResponse> handleMenuException(MenuException ex) {
		ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), 404);
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
}

class ErrorResponse {
	private String msg;
	private int code;

	public ErrorResponse(String msg, int code) {
		this.msg = msg;
		this.code = code;
	}

	// Getters and Setters

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
