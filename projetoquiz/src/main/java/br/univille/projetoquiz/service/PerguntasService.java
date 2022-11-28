package br.univille.projetoquiz.service;

import java.util.List;

import br.univille.projetoquiz.entity.Perguntas;

public interface PerguntasService {
    List<Perguntas> getAll();
    Perguntas save(Perguntas perguntas);
    void delete(long id);
    Perguntas findById(long id);
}
