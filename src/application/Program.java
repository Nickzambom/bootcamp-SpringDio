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

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria("mentoria Java", "Descricao Java", LocalDate.now());

		System.out.println(mentoria);
		System.out.println();
		System.out.println(curso1);
		System.out.println();
		System.out.println(curso2);
	}

}
