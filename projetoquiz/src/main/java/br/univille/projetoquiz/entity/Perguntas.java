package br.univille.projetoquiz.entity;

import javax.persistence.Entity;

@Entity
public class Perguntas {
    private String pergunta;
    private boolean alternativa;
    private int resposta;
    public String getPergunta() {
        return pergunta;
    }
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    public boolean isAlternativa() {
        return alternativa;
    }
    public void setAlternativa(boolean alternativa) {
        this.alternativa = alternativa;
    }
    public int getResposta() {
        return resposta;
    }
    public void setResposta(int resposta) {
        this.resposta = resposta;
    }
    

}
