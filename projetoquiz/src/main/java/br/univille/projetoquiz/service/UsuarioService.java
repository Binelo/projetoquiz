package br.univille.projetoquiz.service;

import br.univille.projetoquiz.entity.Usuario;

public interface UsuarioService {
    Usuario findById(long id);
    
}
