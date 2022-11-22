package br.univille.projetoquiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetoquiz.entity.Quiz;
import br.univille.projetoquiz.repository.QuizRepository;
import br.univille.projetoquiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
    @Autowired
    private QuizRepository repositorio;

    @Override
    public List<Quiz> getAll() {
        
        return repositorio.findAll();
    }
    
}
