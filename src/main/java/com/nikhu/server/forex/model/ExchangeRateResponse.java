package com.nikhu.server.forex.model;

public class ExchangeRateResponse {

	private ExchangeRate exchangeRate;
	private String status;
	private String message;

	public ExchangeRateResponse(ExchangeRate exchangeRate, String status,
			String message) {
		super();
		this.exchangeRate = exchangeRate;
		this.status = status;
		this.message = message;
	}

	public ExchangeRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
