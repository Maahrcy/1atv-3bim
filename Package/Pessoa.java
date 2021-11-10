package Package;
import java.util.*;
import java.io.PrintStream;

public class Pessoa {
	private String nome, telefone;
	private Endereco endereco;

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;

	public Pessoa() {
		sc = new Scanner(System.in);
		ps.println("Informe o nome: ");
		nome = sc.nextLine();
		ps.println("Informe o telefone: ");
		telefone = sc.next();

		endereco = new Endereco();
	}

	public void exibir() {
		ps.println("Nome: "+nome+"\nTelefone: "+telefone);
		endereco.exibir();
	}

	public String getNome() {
		return nome;
	}

	public void atualizar(String telefone, String cidade, String cep) {
		this.telefone = telefone;
		endereco.atualizarEndereco(cidade, cep);
	}
}