package com.nikhu.server.forex.model;

import java.util.Date;

public class ExchangeRate {

	private String base;
	private String target;
	private float value;
	private Date updatedAt;

	public ExchangeRate(String base, String target, float value, Date updatedAt) {
		super();
		this.base = base;
		this.target = target;
		this.value = value;
		this.updatedAt = updatedAt;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
