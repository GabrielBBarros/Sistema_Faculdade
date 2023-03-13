
public class efetivo extends docente {
		protected String area;
		
		efetivo(){
			
		}
		efetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area){
			super(codigo,nome, salario, nivel, titulacao);
			this.area = area;
		}
		public void setArea(String area) {
			if(area == "Biológicas" || area == "Exatas" || area == "Humanas" || area == "Saúde"
					|| area == "Biologicas" || area == "Saude") {
				this.area = area;	
			}
			else System.out.print("Entrada invalida");
		}
		public String getArea() {
			return area;
		}
		public double calcular_salario() {
			double aux = 0;
			if (titulacao == "D1") {
				aux = calcular_salario() + ( calcular_salario()*0.05 ) + ( calcular_salario()*0.05 ) ;
				return aux ;
			}
				
			else if (titulacao == "D2") {
				aux =  calcular_salario() + ( calcular_salario()*0.10 )  + ( calcular_salario()*0.05 );
				return aux;
				}
			
			else if (titulacao == "D3") 
				aux =  calcular_salario() + ( calcular_salario()*0.20 ) + ( calcular_salario()*0.05 );
				return aux;
				
		}
}
