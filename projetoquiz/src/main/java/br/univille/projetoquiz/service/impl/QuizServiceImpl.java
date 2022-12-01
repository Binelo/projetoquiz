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

    @Override
    public Quiz save(Quiz quiz) {
        
        return repositorio.save(quiz);
    }
    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
        
    }
    @Override
    public Quiz findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Quiz();
    }
    
}
