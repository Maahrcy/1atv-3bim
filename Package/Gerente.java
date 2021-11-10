package Package;
import java.util.*;
import java.io.PrintStream;

public class Gerente extends Funcionario{
	private float gratificacao;
	private String departamento;

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;

	public Gerente() {
		super();
		informacoes();
	}

	public void informacoes() {
		sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		ps.println("Informe a gratificação recebida: ");
		gratificacao = sc.nextFloat();
		ps.println("Informe o departamento: ");
		departamento = scanner.nextLine();
	}
	
	public void exibirGerente() {
		exibirFuncionario();
		ps.println("Gratificação: "+gratificacao+"\nDepartamento: "+departamento);
	}

	public float calcularValor() {
		float salario = getSalario() + gratificacao;
		return salario;
	}
}