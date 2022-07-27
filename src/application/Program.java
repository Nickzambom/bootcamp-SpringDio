package application;

import java.time.LocalDate;

import application.dominio.Curso;
import application.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);

		Conteudo conteudo = new Curso();
		conteudo.setTitulo("Curso JavaScript");
		conteudo.setDescricao("Descrição curso JavaScript");
		conteudo.setCargaHoraria(8);

		System.out.println();
		System.out.println(curso1);
		System.out.println();
	}

}
