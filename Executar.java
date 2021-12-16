import Package.*;
import java.util.*;
import java.io.PrintStream;

public class Executar {
	
	private static final PrintStream ps = System.out;
	private static Scanner sc = null;
	private static Scanner scanner = null;

	ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();
	

	Executar() {
		executarCodigo();
	}

	public void executarCodigo() {
		sc = new Scanner(System.in);
		int opcao=0;

		do {
			menu();
			opcao = sc.nextInt();

			switch(opcao) {
				
				case 1:
				cadastrarFuncionario();
				break;

				case 2:
				cadastrarCliente();
				break;

				case 3:
				consultarGerentes();
				consultarVendedores();
				break;

				case 4:
				consultarClientes();
				break;

				case 5:
				consultarGerentes();
				break;

				case 6:
				exibirValorTotal();
				break;

				case 7:
				atualizarFuncionario();
				break;

				case 8:
				atualizarVendedor();
				break;

				case 9:
				atualizarCliente();
				break;

				case 10: 
				cadastrarProduto();
				break;

				case 11:
				exibirProduto();
				break;

				case 12:
				atualizarQuantidade();
				break;

				case 13:
				removerProduto();
				break;

				case 14:
				venderProduto();
				break;

				case 15:
				ps.println("Saindo...");
				break;
				
			}
		}while(opcao != 15);
	}

	public void menu() {
		ps.println("1 - Cadastrar funcionário \n2 - Cadastrar cliente\n3 - Consultar funcionarios\n4 - Consultar clientes\n5 - Consultar apenas gerentes\n6 - Exibir valor total pago aos gerentes\n7- Atualizar endereço e telefone de um determinado funcionário\n8 - Atualizar o valor de vendas de um determinado vendedor\n9 - Atualizar endereço e telefone de um determinado cliente\n10 - Cadastrar um produto\n11 - Exibir produtos\n12 - Atualizar quantidade em estoque\n13 - Remover produtos perecíveis\n14 - Vender um produto\n15 - Sair");
	}

	private void cadastrarFuncionario() {
		sc = new Scanner(System.in);
		ps.println("Cadastrar 1 - Gerente 2 - Vendedor");
		int opcao = sc.nextInt();

		switch (opcao) {

			case 1:
			gerentes.add(new Gerente());
			break;

			case 2:
			vendedores.add(new Vendedor());
			break;

		}
	}

	private void cadastrarCliente() {
		clientes.add(new Pessoa());
	}

	private void consultarClientes() {
		for(int i = 0; i < clientes.size(); i++) {
			if(clientes.contains(null)) {
				ps.println("Não há clientes cadastrados.");
			}else{
				ps.println("---Clientes---");
				clientes.get(i).exibir();
			}
		}
	}

	private void consultarGerentes() {
		for(int i = 0; i < gerentes.size(); i++) {
			if(gerentes.get(i) != null) {
				ps.println("---Gerentes---");
				gerentes.get(i).exibirGerente();
			}else if(gerentes.get(i) == null) {
				ps.println("Não há gerentes cadastrados.");
			}
		}
	}

	private void consultarVendedores() {
		for(int i = 0; i < vendedores.size(); i++) {
			if(vendedores.contains(null)){
				ps.println("Não há vendedores cadastrados.");
			}else{
				ps.println("---Vendedores---");
				vendedores.get(i).exibirVendedor();
			}
		}
	}

	private void exibirValorTotal() {
		float valor = 0;
		for(int i = 0; i < gerentes.size(); i++) {
			if(gerentes.get(i) != null) {
				valor = valor + gerentes.get(i).calcularValor();
			}
		}
		
		if(valor != 0) {
			ps.println("Valor total pago: "+valor);
		}else if(valor == 0) {
			ps.println("Não há gerentes cadastrados. ");
		}
	}

	private void atualizarFuncionario() {
		sc = new Scanner(System.in);
		scanner = new Scanner(System.in);
		ps.println("Atualizar 1 - Gerente 2 - Vendedor");
		int opcao = sc.nextInt();

		switch(opcao) {
			
			case 1: 
			ps.println("Informe o nome: ");
			String nomeGerente = scanner.nextLine();
			for(int i = 0; i < gerentes.size(); i++){
				if(gerentes.get(i).getNome().equalsIgnoreCase(nomeGerente)) {
					ps.println("Informe telefone: ");
					String telefone = scanner.nextLine();
					ps.println("Informe cidade: ");
					String cidade = scanner.nextLine();
					ps.println("Informe CEP: ");
					String cep = scanner.nextLine();
					gerentes.get(i).atualizar(telefone, cidade, cep);
				}
			}
			break;

			case 2:
			ps.println("Informe o nome: ");
			String nomeVendedor = scanner.nextLine();
			for(int i = 0; i < vendedores.size(); i++){
				if(vendedores.get(i).getNome().equalsIgnoreCase(nomeVendedor)) {
					ps.println("Informe telefone: ");
					String telefone = scanner.nextLine();
					ps.println("Informe cidade: ");
					String cidade = scanner.nextLine();
					ps.println("Informe cep: ");
					String cep = scanner.nextLine();
					vendedores.get(i).atualizar(telefone, cidade, cep);
				}
			}
			break;

		}
	}

	private void atualizarVendedor() {
		sc = new Scanner(System.in);
		ps.println("Informe o nome: ");
		String nomeVendedor = sc.nextLine();
		for(int i = 0; i < vendedores.size(); i++){
			if(vendedores.get(i) != null && vendedores.get(i).getNome().equalsIgnoreCase(nomeVendedor)) {
				ps.println("Informe o valor de venda: ");
				float valor = sc.nextFloat();
				vendedores.get(i).atualizarVenda(valor);
			}
		}
	}

	private void atualizarCliente() {
		sc = new Scanner(System.in);
		ps.println("Informe o nome: ");
		String nomeCliente = sc.nextLine();
		for(int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i) != null && clientes.get(i).getNome().equalsIgnoreCase(nomeCliente)) {
				ps.println("Informe telefone, cidade e cep: ");
				String telefone = sc.nextLine();
				String cidade = sc.nextLine();
				String cep = sc.nextLine();
				clientes.get(i).atualizar(telefone, cidade, cep);
			}
		}
	}

	private void cadastrarProduto() {

	}

	private void exibirProduto() {

	}

	private void atualizarQuantidade() {

	}

	private void removerProduto() {

	}

	private void venderProduto() {

	}

	public void greenLine() {
		//tirar a linha verde na classe Main.java
	}
	
}