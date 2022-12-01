package br.univille.projetoquiz.service;

import java.util.List;

import br.univille.projetoquiz.entity.Quiz;

public interface QuizService {
    List<Quiz> getAll();
    Quiz save(Quiz quiz);
    void delete(long id);
    Quiz findById(long id);
}
