package br.univille.projetoquiz.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Rank {
    private int pontuacao;
    @ManyToMany
    private Usuario ranque;
    @OneToOne
    private Quiz score;
    

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Usuario getRanque() {
        return ranque;
    }

    public void setRanque(Usuario ranque) {
        this.ranque = ranque;
    }

    public Quiz getScore() {
        return score;
    }

    public void setScore(Quiz score) {
        this.score = score;
    }
    
}
