package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("descrição curso de java lang");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso Javascript");
       curso2.setDescricao("descrição curso de javascript");
       curso2.setCargaHoraria(8);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria de java");
       mentoria.setDescricao("descricao de java");
       mentoria.setData(LocalDate.now());

       System.out.println("curso1: " + curso1 + " curso2: " + curso2);
       System.out.println(mentoria);

    }
}
