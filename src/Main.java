import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        curso1.setTitulo("Java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("POO");

        curso2.setTitulo("JavaScript");
        curso2.setCargaHoraria(14);
        curso2.setDescricao("React");

        // System.out.println(curso1);
        // System.out.println(curso2);

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Emmanuel");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos "+ dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos "+ dev1.getConteudosConcluidos());
        System.out.println("XP da conta: "+ dev1.calcularTotalXp());

        System.out.println("\n----------------------------------------\n");
        
        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos "+ dev2.getConteudosInscritos());
        System.out.println("XP da conta: "+ dev2.calcularTotalXp());
        dev2.progredir();
        System.out.println("Conteudos Inscritos "+ dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos "+ dev2.getConteudosConcluidos());
        System.out.println("XP da conta: "+ dev2.calcularTotalXp());
        

    }
}
