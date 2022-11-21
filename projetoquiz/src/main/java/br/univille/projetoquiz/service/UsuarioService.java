package br.univille.projetoquiz.service;

import java.util.List;

import br.univille.projetoquiz.entity.Usuario;

public interface UsuarioService {
    List<Usuario> getAll();
    Usuario save(Usuario usuario);
    Usuario findById(long id);
    void delete(long id);
    List<Usuario> findByNome(String nome);
    
}
