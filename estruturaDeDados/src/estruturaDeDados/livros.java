package estruturaDeDados;

public class livros {
	 String titulos;
     String editoras;
     String anoDePublicacao;
     
	public livros(String titulos, String editoras, String anoDePublicacao) {
		
		this.titulos = titulos;
		this.editoras = editoras;
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getTitulos() {
		return titulos;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public String getEditoras() {
		return editoras;
	}

	public void setEditoras(String editoras) {
		this.editoras = editoras;
	}

	public String getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	@Override
	public String toString() {
		return "livros [titulos=" + titulos + ", editoras=" + editoras + ", anoDePublicacao=" + anoDePublicacao + "]";
	}
     

        

}
