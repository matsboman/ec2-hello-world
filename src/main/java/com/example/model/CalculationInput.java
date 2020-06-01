package com.example.model;

public class CalculationInput {
	private Integer price;
	private Integer quantity;
	private Integer discount;
	private Integer width;
	private Integer height;
	private Integer hourlyRate;
	private Integer minSqm;
	private Float additionalServices;
	private Integer additionalPersonnel;
	private Integer additionalHours;
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(Integer hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public Integer getMinSqm() {
		return minSqm;
	}
	public void setMinSqm(Integer minSqm) {
		this.minSqm = minSqm;
	}
	public Float getAdditionalServices() {
		return additionalServices;
	}
	public void setAdditionalServices(Float additionalServices) {
		this.additionalServices = additionalServices;
	}
	public Integer getAdditionalPersonnel() {
		return additionalPersonnel;
	}
	public void setAdditionalPersonnel(Integer additionalMen) {
		this.additionalPersonnel = additionalMen;
	}
	public Integer getAdditionalHours() {
		return additionalHours;
	}
	public void setAdditionalHours(Integer additionalHours) {
		this.additionalHours = additionalHours;
	}
}
