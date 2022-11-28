package br.univille.projetoquiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetoquiz.entity.Rank;
import br.univille.projetoquiz.repository.RankRepository;
import br.univille.projetoquiz.service.RankService;

@Service
public class RankServiceImpl implements RankService{
    @Autowired
    private RankRepository repositorio;
    @Override
    public List<Rank> getAll() {
        
        return repositorio.findAll();
    }
}
