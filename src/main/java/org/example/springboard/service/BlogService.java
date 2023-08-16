package org.example.springboard.service;

import lombok.RequiredArgsConstructor;
import org.example.springboard.domain.Article;
import org.example.springboard.dto.AddArticleRequest;
import org.example.springboard.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public  List<Article> findAll(){
        return blogRepository.findAll();
    }
}