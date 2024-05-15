import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(8, "descricao", "Curso java");
        Curso curso2 = new Curso(8, "descricao", "Curso javaScript");

        Mentoria mentoria01 = new Mentoria();

        mentoria01.setTitulo("Mentoria de java");
        mentoria01.setDescriacao("mentoria");
        mentoria01.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria01);
    }
}