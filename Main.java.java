import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso CSharp");
        curso2.setDescricao("descricao curso CSharp");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Felipe" + devFelipe.getConteudosConcluidos());
        System.out.println("XP: " + devFelipe.calcularTotalXp());



        System.out.println("-------------------------");


        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aline" + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        devAline.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Aline" + devAline.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Aline" + devAline.getConteudosConcluidos());
        System.out.println("XP: " + devAline.calcularTotalXp());


    }
}