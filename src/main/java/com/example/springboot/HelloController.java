package com.example.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Article;
import com.example.model.CalculationInput;
import com.example.model.CalculationResult;

@RestController
public class HelloController {
	Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping(path = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getCalculation(@RequestBody CalculationInput input) {
		CalculationResult result = new CalculationResult();
		result.setGrandTotal(10000);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping(path = "/article/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getArticles(@PathVariable String title) {
		Article article = new Article();
		article.setId(1);
		article.setTitle("LAMELL 6 mm");
		article.setPrice(1300);
		List<Article> articleList = new ArrayList<>();
		articleList.add(article);
		return new ResponseEntity<>(articleList, HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/article/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteNetWorthById(@PathVariable int id) {
		logger.info(String.format("Deleting article id %d", id));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping(path = "/article", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addArticle(@RequestBody Article article) {
		logger.info(String.format("Adding article %s", article.getTitle()));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping(path = "/article", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateArticle(@RequestBody Article article) {
		logger.info(String.format("Updating article %s", article.getTitle()));
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
