package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.model.CalculationInput;
import com.example.model.CalculationResult;

@Component
public class CalculateGlassArticle {
	Logger logger = LoggerFactory.getLogger(CalculateGlassArticle.class);

	private double combinedMeters;
	private double sqm;
	private int price;
	private int quantity;
	private int discount;
	private int width;
	private int height;
	private int minSqm;
	private double pricePerSqm;
	private int materialPrice;
	private int materialMinPrice;
	private double normTime;
	private double additionalServices;
	private double totalTime;
	private double establishment;
	private int totalPrice;
	private int hourlyRate;
	private int additionalMen;
	private int additionalHours;
	private int totalMaterial;
	private int minimumPrice;
	private int totalCostNormTime;
	private int totalLaborCost;
	private int numberOfMen;
	private int materialCost;
	private int rebateMaterial;
	private int workAdditional;
	private int establishmentCost;
	private static final double COMBINED_METER_LIMIT_1 = 3.2;
	private static final double COMBINED_METER_LIMIT_2 = 5.5;
	private static final double COMBINED_METER_LIMIT_3 = 8.6;
	private static final double COMBINED_METER_DENOMINATOR_CONST_1 = 2.6;
	private static final double COMBINED_METER_DENOMINATOR_CONST_2 = -1.5;
	private static final double COMBINED_METER_DENOMINATOR_CONST_3 = 0.15;
	private static final double COMBINED_METER_CONST_1 = 0.45;
	private static final double COMBINED_METER_CONST_2 = -6.55;
	private static final double COMBINED_METER_CONST_3 = 5.5;
	private static final double ADDITION_COMBINED_METER_LIMIT_1 = 1.9;
	private static final double ADDITION_COMBINED_METER_LIMIT_2 = 2.6;
	private static final double ADDITION_COMBINED_METER_LIMIT_3 = 3.2;
	private static final double ADDITION_CONST_1 = 0.5;
	private static final double ADDITION_CONST_2 = 0.3;
	private static final double ADDITION_CONST_3 = -0.8;
	private static final double MINIMUM_PRICE_LIMIT = 0.7;
	private static final double ESTABLISHMENT_COMBINED_METER_LIMIT_1 = 1.9;
	private static final double ESTABLISHMENT_COMBINED_METER_LIMIT_2 = 9.9;
	private static final double ESTABLISHMENT_CONST_1 = 0.8;
	private static final double ESTABLISHMENT_CONST_2 = 0.7;
	private static final double ESTABLISHMENT_NUM_MEN_LIMIT_1 = 1.4;
	private static final double ESTABLISHMENT_NUM_MEN_LIMIT_2 = 2.0;
	private static final double ESTABLISHMENT_NUM_MEN_LIMIT_3 = 2.7;
	private static final int NUM_MEN_CONST = 1;
	
	public void calculate(CalculationInput input) {
		this.price = input.getPrice();
		this.quantity = input.getQuantity();
		this.discount = input.getDiscount();
		this.width = input.getWidth();
		this.height = input.getHeight();
		this.hourlyRate = input.getHourlyRate();
		this.minSqm = input.getMinSqm();
		this.additionalMen = input.getAdditionalMen();
		this.additionalHours = input.getAdditionalHours();

		calculateMaterial();
		calculateLabor();
		calculateSum();
	}
	
	public CalculationResult getResult() {
		CalculationResult result = new CalculationResult();
		result.setAdditionalServices(getAdditionalServices());;
		result.setAdditionalStaffing(getAdditionalStaffing());
		result.setCombinedMeters(getCombinedMeters());
		result.setEstablishment(getEstablishment());
		result.setEstablishmentCost(getEstablishmentCost());
		result.setGrandTotal(getGrandTotal());
		result.setHourlyRate(getHourlyRate());
		result.setMaterialCost(getMaterialCost());
		result.setMaterialMinPrice(getMaterialMinPrice());
		result.setMaterialPrice(getMaterialPrice());
		result.setMaterialTotalCost(getMaterialTotalCost());
		result.setMinimumPrice(getMinimumPrice());
		result.setNormTime(getNormTime());
		result.setNumberOfMen(getNumberOfMen());
		result.setRebateMaterial(getRebateMaterial());
		result.setSqm(getSqm());
		result.setTotalCostNormTime(getTotalCostNormTime());
		result.setTotalLaborCost(getTotalLaborCost());
		result.setTotalMaterial(getTotalMaterial());
		result.setTotalPrice(getTotalPrice());
		result.setTotalTime(getTotalTime());
		result.setWorkAdditional(getWorkAdditional());
		result.setWorkTotalCost(getWorkTotalCost());
		
		return result;
	}

	private void calculateMaterial() {
		double discountFactor = discount / 100.0;
		this.sqm = width * height / 1000000.0;
		this.pricePerSqm = price * (1.0 - discountFactor);
		this.materialPrice = (int) Math.round(pricePerSqm * sqm);
		this.materialMinPrice = (int) Math.round(Math.max(minSqm, sqm) * pricePerSqm);
		this.totalMaterial = Math.max(materialMinPrice, materialPrice);
		this.combinedMeters = (width + height) / 1000.0;
	}

	private void calculateLabor() {
		double denominator = COMBINED_METER_DENOMINATOR_CONST_1
				+ (COMBINED_METER_LIMIT_1 < this.combinedMeters ? COMBINED_METER_DENOMINATOR_CONST_2 : 0)
				+ (COMBINED_METER_LIMIT_2 < this.combinedMeters ? COMBINED_METER_DENOMINATOR_CONST_3 : 0);
		double constant = COMBINED_METER_CONST_1
				+ (COMBINED_METER_LIMIT_1 <= this.combinedMeters ? COMBINED_METER_CONST_2 : 0)
				+ (COMBINED_METER_LIMIT_2 <= this.combinedMeters ? COMBINED_METER_CONST_3 : 0);
		this.additionalServices = (ADDITION_COMBINED_METER_LIMIT_1 < this.combinedMeters ? ADDITION_CONST_1 : 0)
				+ (ADDITION_COMBINED_METER_LIMIT_2 < this.combinedMeters ? ADDITION_CONST_2 : 0)
				+ (ADDITION_COMBINED_METER_LIMIT_3 < this.combinedMeters ? ADDITION_CONST_3 : 0);
		this.normTime = Math.pow(this.combinedMeters / denominator, 2d) + constant;
		this.totalTime = this.normTime + this.additionalServices;
		this.totalPrice = (int) Math.round(this.totalTime * this.hourlyRate);
		this.minimumPrice = (int) Math
				.round(this.normTime < MINIMUM_PRICE_LIMIT ? (MINIMUM_PRICE_LIMIT * this.hourlyRate)
						: (this.totalTime * this.hourlyRate));
		this.totalCostNormTime = Math.max(this.totalPrice, this.minimumPrice);
		this.totalLaborCost = Math.round(this.combinedMeters < COMBINED_METER_LIMIT_3
				? (this.totalCostNormTime + this.hourlyRate * this.additionalMen * this.additionalHours)
				: 0);
		// TODO: Verify establishment calculation with multiple glass panes, we assume
		// just to multiply
		// TODO: the combinedMeters with quantity here.
		this.establishment = ESTABLISHMENT_CONST_1
				+ (ESTABLISHMENT_COMBINED_METER_LIMIT_1 < (combinedMeters * this.quantity) ? ESTABLISHMENT_CONST_1 : 0)
				+ (ESTABLISHMENT_COMBINED_METER_LIMIT_2 < (combinedMeters * this.quantity) ? ESTABLISHMENT_CONST_2 : 0);
		this.numberOfMen = NUM_MEN_CONST + (ESTABLISHMENT_NUM_MEN_LIMIT_1 < this.establishment ? NUM_MEN_CONST : 0)
				+ (ESTABLISHMENT_NUM_MEN_LIMIT_2 < this.establishment ? NUM_MEN_CONST : 0)
				+ (ESTABLISHMENT_NUM_MEN_LIMIT_3 < this.establishment ? NUM_MEN_CONST : 0);
	}

	private void calculateSum() {
		this.establishmentCost = (int) Math.round(establishment * this.hourlyRate);
		this.materialCost = (int) Math.round(Math.max(sqm, minSqm) * this.price * quantity);
		this.rebateMaterial = (int) -Math.round((Math.max(minSqm, sqm) * this.price * discount * quantity / 100.0));
		this.totalCostNormTime = quantity * (combinedMeters < COMBINED_METER_LIMIT_3 ? totalCostNormTime : 0);
		this.workAdditional = quantity * (combinedMeters < COMBINED_METER_LIMIT_3 ? getAdditionalStaffing() : 0);
	}

	Double getPricePerSqm() {
		return roundDouble(this.pricePerSqm);
	}

	Double getSqm() {
		return this.sqm;
	}

	Integer getHourlyRate() {
		return this.hourlyRate;
	}

	Double getCombinedMeters() {
		return this.combinedMeters;
	}

	Double getNormTime() {
		return roundDouble(this.normTime);
	}

	Double getAdditionalServices() {
		return roundDouble(this.additionalServices);
	}

	Double getTotalTime() {
		return roundDouble(this.totalTime);
	}

	Integer getNumberOfMen() {
		return this.numberOfMen;
	}

	Double getEstablishment() {
		return this.establishment;
	}

	Integer getTotalPrice() {
		return this.totalPrice;
	}

	Integer getMinimumPrice() {
		return this.minimumPrice;
	}

	Integer getTotalLaborCost() {
		return this.totalLaborCost;
	}

	Integer getAdditionalStaffing() {
		return this.hourlyRate * this.additionalMen * this.additionalHours;
	}

	Integer getTotalCostNormTime() {
		return this.totalCostNormTime;
	}

	Integer getMaterialPrice() {
		return this.materialPrice;
	}

	Integer getMaterialMinPrice() {
		return this.materialMinPrice;
	}

	Integer getTotalMaterial() {
		return this.totalMaterial;
	}

	Integer getMaterialCost() {
		return this.materialCost;
	}

	Integer getRebateMaterial() {
		return this.rebateMaterial;
	}

	Integer getMaterialTotalCost() {
		return this.materialCost + this.rebateMaterial;
	}

	Integer getWorkAdditional() {
		return this.workAdditional;
	}

	Integer getEstablishmentCost() {
		return this.establishmentCost;
	}

	Integer getWorkTotalCost() {
		return this.totalCostNormTime + this.workAdditional + this.establishmentCost;
	}

	Integer getGrandTotal() {
		return this.getWorkTotalCost() > 0 ? this.getMaterialTotalCost() + this.getWorkTotalCost() : 0;
	}

	private double roundDouble(double value) {
		return Math.round(value * 100) / 100.0;
	}
}
