package Package;
import java.util.*;
import java.io.PrintStream;

public class Vendedor extends Funcionario{
	private float valor;

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;

	public Vendedor() {
		super();
		informacoes();
	}

	public void informacoes() {
		sc = new Scanner(System.in);
		ps.println("Informe o valor de venda: ");
		valor = sc.nextFloat();
	}

	public void exibirVendedor() {
		exibirFuncionario();
		ps.println("Valor de vendas do mês: "+valor);
	}

	public void atualizarVenda(float valor) {
		this.valor = valor;
	}
}