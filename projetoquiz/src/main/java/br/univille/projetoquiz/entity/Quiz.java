package br.univille.projetoquiz.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Quiz {
    private String nome;
    @ManyToOne
    private Usuario quiz;
    @OneToMany
    private Perguntas perguntas;

    
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
    public Perguntas getPerguntas() {
        return perguntas;
    }
    public void setPerguntas(Perguntas perguntas) {
        this.perguntas = perguntas;
    }
    
}
