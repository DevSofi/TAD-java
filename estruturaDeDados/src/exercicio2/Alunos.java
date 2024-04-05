package exercicio2;

public class Alunos {
	String nome;
	String semestre;
	
	public Alunos(String nome, String semestre) {
	
		this.nome = nome;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "alunos [nome=" + nome + ", semestre=" + semestre + "]";
	}
	
	
}
