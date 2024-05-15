import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("mentoria");
        mentoria1.setData(LocalDate.now());

        curso1.setTitulo("Curso java");
        curso1.setDescricao("curso");
        curso1.setCargaHoraria(10);

        System.out.println(curso1);

        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devBruno = new Dev();
        Dev devJoao = new Dev();

        devBruno.inscreverBootcamp(bootcamp);
        devJoao.inscreverBootcamp(bootcamp);

        devBruno.setNome("Bruno");
        devJoao.setNome("Joao");

        System.out.println("Conteudos inscritos: " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());

        devBruno.progredir();
        devJoao.progredir();
        devBruno.progredir();

        System.out.println("Conteudos concluidos: " + devBruno.getConteudosConcluidos());
        System.out.println("Conteudos concluidos: " + devJoao.getConteudosConcluidos());

        System.out.println("Conteudos inscritos: " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());

        System.out.println(devBruno.calcularXp());
        System.out.println(devJoao.calcularXp());

    }
}