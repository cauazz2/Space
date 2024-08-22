package entidade;

public class Corrente extends Conta{
	private double limite;

	public Corrente(String nome, int numero, double saldo, double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
	}
	public String toString() {
		return "Corrente" +mostrar() 
		+ "limite = " + limite + " ";
	}
}
