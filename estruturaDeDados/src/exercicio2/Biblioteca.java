package exercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca implements Armazenar {
	List<Alunos> alunos = new ArrayList<Alunos>();

	@Override
	public void listar() {
		for (Alunos alunos2 : alunos) {
			System.out.println(alunos2);
		}

	}

	@Override
	public void adicionar(String nome, String semestre) {
		alunos.add(new Alunos(nome, semestre));

	}

}
