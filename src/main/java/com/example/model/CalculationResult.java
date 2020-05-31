package com.example.model;

public class CalculationResult {
	private Double sqm;
	private Integer hourlyRate;
	private Double combinedMeters;
	private Double normTime;
	private Double additionalServices;
	private Double TotalTime;
	private Integer numberOfPersonnel;
	private Double establishment;
	private Integer laborPrice;
	private Integer minimumLaborPrice;
	private Integer totalLaborPrice;
	private Integer additionalStaffing;
	private Integer totalPriceNormTimeSum;
	private Integer materialPrice;
	private Integer materialMinPrice;
	private Integer totalMaterial;
	private Integer materialPriceSum;
	private Integer discountMaterial;
	private Integer materialTotalPriceSum;
	private Integer laborAdditionalSum;
	private Integer establishmentPrice;
	private Integer laborTotalPriceSum;
	private Integer grandTotal;
	
	public Double getSqm() {
		return sqm;
	}
	public void setSqm(Double sqm) {
		this.sqm = sqm;
	}
	public Integer getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(Integer hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public Double getCombinedMeters() {
		return combinedMeters;
	}
	public void setCombinedMeters(Double combinedMeters) {
		this.combinedMeters = combinedMeters;
	}
	public Double getNormTime() {
		return normTime;
	}
	public void setNormTime(Double normTime) {
		this.normTime = normTime;
	}
	public Double getAdditionalServices() {
		return additionalServices;
	}
	public void setAdditionalServices(Double additionalServices) {
		this.additionalServices = additionalServices;
	}
	public Double getTotalTime() {
		return TotalTime;
	}
	public void setTotalTime(Double totalTime) {
		TotalTime = totalTime;
	}
	public Integer getNumberOfPersonnel() {
		return numberOfPersonnel;
	}
	public void setNumberOfPersonnel(Integer numberOfMen) {
		this.numberOfPersonnel = numberOfMen;
	}
	public Double getEstablishment() {
		return establishment;
	}
	public void setEstablishment(Double establishment) {
		this.establishment = establishment;
	}
	public Integer getLaborPrice() {
		return laborPrice;
	}
	public void setLaborPrice(Integer totalPrice) {
		this.laborPrice = totalPrice;
	}
	public Integer getMinimumLaborPrice() {
		return minimumLaborPrice;
	}
	public void setMinimumLaborPrice(Integer minimumPrice) {
		this.minimumLaborPrice = minimumPrice;
	}
	public Integer getTotalLaborPrice() {
		return totalLaborPrice;
	}
	public void setTotalLaborPrice(Integer totalLaborCost) {
		this.totalLaborPrice = totalLaborCost;
	}
	public Integer getAdditionalStaffing() {
		return additionalStaffing;
	}
	public void setAdditionalStaffing(Integer additionalStaffing) {
		this.additionalStaffing = additionalStaffing;
	}
	public Integer getTotalPriceNormTimeSum() {
		return totalPriceNormTimeSum;
	}
	public void setTotalPriceNormTimeSum(Integer totalCostNormTime) {
		this.totalPriceNormTimeSum = totalCostNormTime;
	}
	public Integer getMaterialPrice() {
		return materialPrice;
	}
	public void setMaterialPrice(Integer materialPrice) {
		this.materialPrice = materialPrice;
	}
	public Integer getMaterialMinPrice() {
		return materialMinPrice;
	}
	public void setMaterialMinPrice(Integer materialMinPrice) {
		this.materialMinPrice = materialMinPrice;
	}
	public Integer getTotalMaterial() {
		return totalMaterial;
	}
	public void setTotalMaterial(Integer totalMaterial) {
		this.totalMaterial = totalMaterial;
	}
	public Integer getMaterialPriceSum() {
		return materialPriceSum;
	}
	public void setMaterialPriceSum(Integer materialCost) {
		this.materialPriceSum = materialCost;
	}
	public Integer getDiscountMaterial() {
		return discountMaterial;
	}
	public void setDiscountMaterial(Integer rebateMaterial) {
		this.discountMaterial = rebateMaterial;
	}
	public Integer getMaterialTotalPriceSum() {
		return materialTotalPriceSum;
	}
	public void setMaterialTotalPriceSum(Integer materialTotalCost) {
		this.materialTotalPriceSum = materialTotalCost;
	}
	public Integer getLaborAdditionalSum() {
		return laborAdditionalSum;
	}
	public void setLaborAdditionalSum(Integer laborAdditional) {
		this.laborAdditionalSum = laborAdditional;
	}
	public Integer getEstablishmentPrice() {
		return establishmentPrice;
	}
	public void setEstablishmentPrice(Integer establishmentCost) {
		this.establishmentPrice = establishmentCost;
	}
	public Integer getLaborTotalPriceSum() {
		return laborTotalPriceSum;
	}
	public void setLaborTotalPriceSum(Integer workTotalCost) {
		this.laborTotalPriceSum = workTotalCost;
	}
	public Integer getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Integer grandTotal) {
		this.grandTotal = grandTotal;
	}
}
