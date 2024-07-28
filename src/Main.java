import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main  {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Java");
        mentoria.setDescricao("Descrição mentoria do Java");
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

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos Gabriel" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("---");
        System.out.println("Contéudos Inscritos Gabriel" + devGabriel.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Gabriel" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularXp());
        System.out.println("---------------");

        Dev devMonick = new Dev();
        devMonick.setNome("Monick");
        devMonick.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos Monick" + devMonick.getConteudosInscritos());
        devMonick.progredir();
        devMonick.progredir();
        devMonick.progredir();
        System.out.println("---");
        System.out.println("Contéudos Inscritos Monick" + devMonick.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Monick" + devMonick.getConteudosConcluidos());
        System.out.println("XP:" + devMonick.calcularXp());
        System.out.println("---------------");









    }
}