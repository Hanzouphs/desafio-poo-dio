import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescriacao("Descrição do curso de Java");
        curso1.setCaragHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescriacao("Descrição do curso de JavaScript");
        curso2.setCaragHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de C#");
        mentoria1.setDescriacao("Descrição mentoria de C#");
        mentoria1.setData(LocalDate.now());

    }
}