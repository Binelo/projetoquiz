package br.univille.projetoquiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetoquiz.entity.Perguntas;
import br.univille.projetoquiz.repository.PerguntasRepository;
import br.univille.projetoquiz.service.PerguntasService;

@Service
public class PerguntasServiceImpl implements PerguntasService{

    @Autowired
    private PerguntasRepository repositorio;

    @Override
    public List<Perguntas> getAll() {
        
        return repositorio.findAll();
    }

    @Override
    public Perguntas save(Perguntas perguntas) {
        
        return repositorio.save(perguntas);
    }
    
}
