package Package;
import java.util.*;
import java.io.PrintStream;

public class Produto {
	private String codigo, nome;
	private float preco, quantEstoque;

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;

	public Produto() {
		sc = new Scanner(System.in);
		ps.println("Código: ");
		codigo = sc.next();
		ps.println("Nome: ");
		nome = sc.nextLine();
		ps.println("Preço: ");
		preco = sc.nextFloat();
		ps.println("Quantidade em estoque: ");
		quantEstoque = sc.nextFloat();
	}

}