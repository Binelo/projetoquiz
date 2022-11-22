package br.univille.projetoquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetoquiz.entity.Rank;


@Repository
public interface RankRepository 
extends JpaRepository<Rank,Long>{
    
}
