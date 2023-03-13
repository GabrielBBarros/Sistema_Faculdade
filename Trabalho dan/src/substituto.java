
public class substituto extends docente {
	protected int cargaHoraria;
	
	substituto(){
		
	}
	substituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria){
		this.cargaHoraria = cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		if (cargaHoraria == 12 || cargaHoraria == 24) {
			this.cargaHoraria = cargaHoraria;
			}
		else System.out.print("Entrada invalida");
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public double calcular_salario() {
		double aux = 0;
		if (titulacao == "S1") {
			aux = (calcular_salario()+calcular_salario()*0.05);
			return aux ;
		}
		else if (titulacao == "S2") 
			aux = (calcular_salario()+(calcular_salario()*0.1));
			return aux;		
	}
	
}
