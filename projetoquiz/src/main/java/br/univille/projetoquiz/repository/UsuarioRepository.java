package br.univille.projetoquiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetoquiz.entity.Usuario;

@Repository
public interface UsuarioRepository 
extends JpaRepository<Usuario,Long>{

    List<Usuario> findByNomeIgnoreCaseContaining(String nome);
    
}
