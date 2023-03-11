package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descriacao;
    private int caragHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriacao() {
        return descriacao;
    }

    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }

    public int getCaragHoraria() {
        return caragHoraria;
    }

    public void setCaragHoraria(int caragHoraria) {
        this.caragHoraria = caragHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descriacao='" + descriacao + '\'' +
                ", caragHoraria=" + caragHoraria +
                '}';
    }
}
