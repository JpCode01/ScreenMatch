package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisuaizacoes;

    public void setTotalVisuaizacoes(int totalVisuaizacoes) {
        this.totalVisuaizacoes = totalVisuaizacoes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisuaizacoes() {
        return totalVisuaizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Serie getSerie() {
        return serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisuaizacoes > 100) {
            return 4;
        } else {
            return 0;
        }
    }
}
