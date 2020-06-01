package com.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.CalculateGlassArticle;
import com.example.model.CalculationInput;

@RestController
public class CalculationController {
	Logger logger = LoggerFactory.getLogger(CalculationController.class);

	@Autowired
	private CalculateGlassArticle calculateArticle;

	@GetMapping(path = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getCalculation(@RequestBody CalculationInput input) {
//		logger.info("Price:\t\t" + input.getPrice().toString());
//		logger.info("Quantity:\t\t" + input.getQuantity().toString());
//		logger.info("Discount:\t\t" + input.getDiscount().toString());
//		logger.info("width:\t\t" + input.getWidth().toString());
//		logger.info("Height:\t\t" + input.getHeight().toString());
//		logger.info("HourlyRate:\t\t" + input.getHourlyRate().toString());
//		logger.info("MinSqm:\t\t" + input.getMinSqm().toString());
//		logger.info("AdditionalServices:\t\t" + input.getAdditionalServices().toString());
//		logger.info("AdditionalPersonnel:\t" + input.getAdditionalPersonnel().toString());
//		logger.info("AdditionalHours:\t\t" + input.getAdditionalHours().toString());
		calculateArticle.calculate(input);
		return new ResponseEntity<>(calculateArticle.getResult(), HttpStatus.OK);
	}
}
