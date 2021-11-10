package Package;
import java.util.*;
import java.io.PrintStream;

public class Endereco {
	private String cidade, cep;

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;
	
	public Endereco() {
		informacoes();
	}

	public void informacoes() {
		sc = new Scanner (System.in);
		ps.println("Informe a cidade: ");
		cidade = sc.nextLine();
		ps.println("Informe o CEP: ");
		cep = sc.next();
	}

	public void exibir() {
		ps.println("Cidade: "+cidade+"\nCEP: "+cep);
	}

	public void atualizarEndereco(String cidade, String cep) {
		this.cidade = cidade;
		this.cep = cep;
	}
}