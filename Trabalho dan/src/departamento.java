import java.util.Scanner;


public class departamento {
	private int MAX = 100;
	private int cont = 0;
	private int aux;
	private String codigo;
	private String nome;
	private funcionario[]funcionario;
	
	Scanner sc = new Scanner(System.in);
	
	public void machine() {
		int op;
		String codigo;
		String nome;
		double salario;
		String nivel;
		String funcao;
		String titulacao;
		String area;
		String cargaHoraria;
		
		funcionario = new funcionario[MAX];
		cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			op = menu();
			
			switch(op) {
			case 1:
				if (cont != 0){
					System.out.println("Funcionarios Cadastrados!\n");
					for (aux = 0; aux <= cont; aux++) {
						System.out.println(aux+1+" - "+funcionario[aux].getNome());
						System.out.println("");
					}
				
				}
				break;
			
			case 2:
				
				break;
			
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
			case 7:
	
				break;
			case 8:
	
				break;
				
			case 9:
	
				break;
				
			case 10:
	
				break;
				
			case 11:
	
				break;
				
			case 12:
	
				break;
				
			case 13:
	
				break;
				
				
				
				
				
				
			case 14:
				if(cont < MAX) {
				System.out.println("TECNICO");
				
				System.out.print("Introduza o código do tecnico: ");
				codigo = sc.nextLine();
				System.out.println();				
				
				System.out.print("Introduza o nome do tecnico: ");
				nome = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza o salario do tecnico");
				salario = sc.nextDouble();
				System.out.println();
				
				System.out.print("Introduza o nível do tecnico: ");
				nivel = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza a Área do tecníco: ");
				funcao = sc.nextLine();
				System.out.println();
				
				//funcionario[cont] = new tecnico(codigo,nome, salario, nivel, funcao);
				cont++;
				}
				else System.out.println("Depatartamento está sem vaga");
				
				break;
			case 15:
				if(cont < MAX) {
				System.out.println("DOCENTE EFETIVO");
				
				System.out.print("Introduza o código do docente efetivo: ");
				codigo = sc.nextLine();
				System.out.println();				
				
				System.out.print("Introduza o nome do docente efetivo: ");
				nome = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza o salario do docente efetivo");
				salario = sc.nextDouble();
				System.out.println();
				
				System.out.print("Introduza o nível do docente efetivo: ");
				nivel = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza a titulação do docente efetivo: ");
				titulacao = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza a area do docente efetivo: ");
				area = sc.nextLine();
				System.out.println();
				
				funcionario[cont] = new efetivo(codigo,nome, salario, nivel, titulacao, area);
				cont++;
				}
				else System.out.println("Depatartamento está sem vaga");
				break;
				
			case 16:
				if(cont <MAX) {
				System.out.println("DOCENTE SUBSTITUTO");
				
				System.out.print("Introduza o código do docente substituto: ");
				codigo = sc.nextLine();
				System.out.println();				
				
				System.out.print("Introduza o nome do docente substituto: ");
				nome = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza o salario do docente substituto");
				salario = sc.nextDouble();
				System.out.println();
				
				System.out.print("Introduza o nível do docente substituto: ");
				nivel = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza a titulação do docente substituto: ");
				titulacao = sc.nextLine();
				System.out.println();
				
				System.out.print("Introduza a carga horaria do docente substituto: ");
				cargaHoraria = sc.nextLine();
				System.out.println();
				
				funcionario[cont] = new efetivo(codigo,nome, salario, nivel, titulacao, cargaHoraria);
				cont++;
				}
				else System.out.println("Depatartamento está sem vaga");
				break;
			}
			
		}while(op !=17 );
		
	} 
	
	public int menu() {
		String menu = "MENU\n\n"+
		"RELATORIOS\n"+
		"1 – Geral\n"+
		"2 – Resumo dos Departamentos\n"+
		"3 – Resumo dos Departamentos com gasto em faixa específica\n"+
		"4 - Funcionários com Salário em Faixa Específica\n"+
		"5 – Exibir Todos os Funcionários\n"+
		"6 – Exibir Todos os Técnicos:\n"+
		"7 – Exibir Todos os Docentes:\n"+
		"8 – Exibir Todos os Docentes Efetivos\n"+
		"9 – Exibir Todos os Docentes Substitutos\n"+
		"10 – Exibir Informações de um Departamento\n"+
		"11 – Buscar um Funcionários pelo Código\n"+
		"12 – Buscar um Funcionários pelo Nome\n"+
		"13 – Buscar um Funcionários pelo Nome\n\n"+
		
		"CADASTRO \n"+
		"14 - Cadastrar Técnico\n"+
		"15 - Cadastro Docente Efetivo\n"+
		"16 - Cadastro Docente Substituto\n"+
		"17 – Sair\n";
		
		System.out.println(menu);
		System.out.println("Digite a opção: ");
		Scanner sc = new Scanner(System.in);
		int op = Integer.parseInt(sc.nextLine());
		return op;
	}
	
	
	
}
