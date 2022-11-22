package br.univille.projetoquiz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Quiz {
    @Id
    private long id;
    private String nome;
    @ManyToOne
    private Usuario quiz;
    @OneToMany
    private List<Perguntas> listaPerguntas = new ArrayList<>();

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Usuario getQuiz() {
        return quiz;
    }
    public void setQuiz(Usuario quiz) {
        this.quiz = quiz;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public List<Perguntas> getListaPerguntas() {
        return listaPerguntas;
    }
    public void setListaPerguntas(List<Perguntas> listaPerguntas) {
        this.listaPerguntas = listaPerguntas;
    }
    
    
    
}
