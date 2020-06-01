package com.example.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ArticleRepository;
import com.example.dao.UserRepository;
import com.example.model.Article;
import com.example.model.User;

@RestController
public class ArticleController {
	Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	@Autowired
	private ArticleRepository articleRepository;

	@GetMapping(path = "/article/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Article> getArticles() {
		return articleRepository.findAll();
	}
	
	@GetMapping(path = "/article/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Article> getArticle(@PathVariable long id) {
		Optional<Article> articleOptional = articleRepository.findById(id);
		if (!articleOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return new ResponseEntity<>(articleOptional.get(), HttpStatus.OK);
	}

	@DeleteMapping(path = "/article/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteNetWorthById(@PathVariable long id) {
		Optional<Article> articleOptional = articleRepository.findById(id);
		if (!articleOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		logger.info(String.format("Deleting article id %d", id));
		articleRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping(path = "/article", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addArticle(@RequestBody Article article) {
		logger.info(String.format("Adding article %s", article.getTitle()));
		article.setCreatedAt(new Date(System.currentTimeMillis()));
		articleRepository.save(article);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(path = "/article/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateArticle(@RequestBody Article article, @PathVariable long id) {
		Optional<Article> articleOptional = articleRepository.findById(id);
		if (!articleOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Article existing = articleOptional.get();
		existing.updateFrom(article);
		existing.setUpdatedAt(new Date(System.currentTimeMillis()));
		articleRepository.save(existing);
		return ResponseEntity.noContent().build();
	}
}
