package Package;
import java.util.*;
import java.io.PrintStream;

public class Perecivel extends Produto {
	private String dataEntrada;
	private float quantDias; 

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;

	public Perecivel() {
		super();
		setPerecivel();
	}

	public void setPerecivel() {
		sc = new Scanner(System.in);
		ps.println("Data de entrada: ");
		dataEntrada = sc.next();
		ps.println("Quantidade de Dias: ");
		quantDias = sc.nextFloat();
	}
	
}