package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}