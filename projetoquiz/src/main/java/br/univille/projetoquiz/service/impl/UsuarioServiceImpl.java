package br.univille.projetoquiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetoquiz.entity.Usuario;
import br.univille.projetoquiz.repository.UsuarioRepository;
import br.univille.projetoquiz.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired 
    private UsuarioRepository repositorio;
    
    @Override
    public Usuario findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Usuario();
    }

    @Override
    public List<Usuario> getAll() {
        return repositorio.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repositorio.save(usuario);
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public List<Usuario> findByNome(String nome) {
        return repositorio.findByNomeIgnoreCaseContaining(nome);
    }
    
}
