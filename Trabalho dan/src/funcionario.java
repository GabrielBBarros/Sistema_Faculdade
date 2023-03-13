
public abstract class funcionario {
	protected String codigo;
	protected String nome;
	protected double salario;
	protected String nivel;
	
	
	funcionario(){
		
		
	}
	
	funcionario(String codigo, String nome, double salario, String nivel){
		this.codigo = codigo;
		this.nome=nome;
		this.salario = salario;
		this.nivel = nivel;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public String getNivel() {
		return nivel;
	}
	
	
	public double calcular_salario() {
		return salario;
	}
	
	
	
	
	
	
}
