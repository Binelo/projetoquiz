package br.univille.projetoquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetoquiz.entity.Quiz;

@Repository
public interface QuizRepository 
extends JpaRepository<Quiz,Long>{
    
}
