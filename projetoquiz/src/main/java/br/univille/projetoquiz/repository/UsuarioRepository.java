package br.univille.projetoquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetoquiz.entity.Usuario;

@Repository
public interface UsuarioRepository 
extends JpaRepository<Usuario,Long>{
    
}
