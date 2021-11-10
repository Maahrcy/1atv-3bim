package Package;
import java.util.*;
import java.io.PrintStream;

public class Funcionario extends Pessoa{
	private float salario;
	private String setor;

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;
	private static Scanner scanner = null;

	public Funcionario() {
		super();
		scanner = new Scanner(System.in);
		sc = new Scanner(System.in);
		ps.println("Informe o salario: ");
		salario = sc.nextFloat();
		ps.println("Informe o setor em que o funcionario trabalha: ");
		setor = scanner.nextLine();
	}

	public void exibirFuncionario() {
		exibir();
		ps.println("Salario: "+salario+"\nSetor: "+setor);
	}

	public float getSalario(){
		return salario;
	}
}