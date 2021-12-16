package Package;
import java.util.*;
import java.io.PrintStream;

public class Lampada {
	private String tipo, cor; 
	private float potencia;

	private static final PrintStream ps = System.out;
	private static Scanner sc = null;

	public Lampada() {
		super();
		setLampada();
	}

	public void setLampada() {
		sc = new Scanner(System.in);
		ps.println("Tipo: ");
		tipo = sc.nextLine();
		ps.println("Cor: ");
		cor = sc.nextLine();
		ps.println("Potência: ");
		potencia = sc.nextFloat();
	}

}