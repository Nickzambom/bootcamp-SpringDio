package application;

import java.time.LocalDate;

import application.dominio.Bootcamp;
import application.dominio.Curso;
import application.dominio.Dev;
import application.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Java dev 2.0");
		curso1.setCargaHoraria(8);

		curso2.setTitulo("Curso de Js");
		curso2.setDescricao("JS dev 2.0");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Mentoria para Java Master");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Develepor");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		
		
		
		Dev devNicholas = new Dev();
		devNicholas.setNome("Nicholas");
		devNicholas.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Nicholas " + devNicholas.getConteudosInscritos());
		System.out.println();
		devNicholas.progredir();
		devNicholas.progredir();
		devNicholas.progredir();
		System.out.println("Conteudos Concluidos Nicholas " + devNicholas.getConteudosConcluidos());
		System.out.println();
		System.out.println("Conteudos Inscritos Nicholas " + devNicholas.getConteudosInscritos());
		System.out.println("XP: " + devNicholas.calcularTotalXp());
		System.out.println("----------------------------");
		
		
		
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
		System.out.println();
		devJoao.progredir();
		System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
		System.out.println();
		System.out.println("Conteudos Concluidos Joao " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}

}
