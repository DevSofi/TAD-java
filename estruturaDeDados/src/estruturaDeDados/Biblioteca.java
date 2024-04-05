package estruturaDeDados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca implements Armazenar {
 
	List<livros> livros = new ArrayList<livros>();
	
	@Override
	public void listar() {
		for (livros livros2 : livros) {
			System.out.println(livros2);
}
		
	}

	@Override
	public void add(String titulo, String Editora, String AnoDePublicacao) {
		livros.add(new livros(titulo, Editora, AnoDePublicacao));
		
	}
 
}
