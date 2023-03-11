package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCaragHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int caragHoraria) {
        this.cargaHoraria = caragHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", caragHoraria=" + cargaHoraria +
                '}';
    }

}
