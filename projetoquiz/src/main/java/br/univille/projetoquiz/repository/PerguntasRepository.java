package br.univille.projetoquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetoquiz.entity.Perguntas;

@Repository
public interface PerguntasRepository
extends JpaRepository<Perguntas,Long> {
    
}
