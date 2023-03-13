
public abstract class docente extends funcionario {
	protected String titulacao;
	
	docente(){
		
	}
	docente (String codigo, String nome, double salario, String nivel, String titulacao) {
		super(codigo, nome, salario, nivel);
		this.titulacao=titulacao;
	}
	public void setTitulacao(String titulacao) {
		if (titulacao == "Graduação" || titulacao == "Mestrado" || titulacao == "Doutorado"
			|| titulacao == "Livre-Docente" || titulacao == "Titular") {
			this.titulacao = titulacao;
		}
		else System.out.print("Entrada invalida");
	}
	public String getTitulacao() {
		return titulacao;
	}
	
}
