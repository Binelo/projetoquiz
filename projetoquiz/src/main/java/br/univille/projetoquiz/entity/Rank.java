package br.univille.projetoquiz.entity;

import javax.persistence.Entity;

@Entity
public class Rank {
    private int pontuacao;

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
}
