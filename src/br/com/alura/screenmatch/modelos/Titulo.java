package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excessao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    //@SerializedName("Title") // O Java object convertido em Json tratará esses atributos da maneira como escolhida do Json
    private String nome ;
    // @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) { // Construtor
             this.nome = meuTituloOmdb.title();
            if (meuTituloOmdb.year().length() > 4) {
                throw new ErroDeConversaoDeAnoException("Não conseguiu converter o ano, pois tem mais de 4 caracteres");
            }
            this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento:  " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
            return "Título: " + this.nome + "\nData de lançamento: " + this.anoDeLancamento + "\nDuração em minutos: " + this.duracaoEmMinutos;
    }
}
