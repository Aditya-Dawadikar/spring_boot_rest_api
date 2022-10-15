package com.springbasic.rest.Models.StandardRequestModels;

public class StandardResponse<T> {
	
	String responseStatus;
	String message;
	T data;
	
	public StandardResponse() {
		this.responseStatus = "200";
		this.message = "";
		this.data = null;
	}
	
	public StandardResponse(String status,String msg,T body) {
		this.responseStatus = status;
		this.message = msg;
		this.data = body;
	}
	
	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
