import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de C#");
        mentoria1.setDescricao("Descrição mentoria de C#");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JavaDeveloper");
        bootcamp.setDescricao("Decrição Bootcamp JavaDeveloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

        System.out.println("--------");

        Dev devMariana = new Dev();
        devMariana.setNome("Mariana");
        devMariana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mariana:" + devMariana.getConteudosInscritos());
        devMariana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mariana:" + devMariana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mariana:" + devMariana.getConteudosConcluidos());
        System.out.println("XP:" + devMariana.calcularTotalXp());

    }
}