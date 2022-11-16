package br.univille.projetoquiz.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Rank {
    private int pontuacao;
    @ManyToMany
    private Usuario ranque;

    

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
    
}
