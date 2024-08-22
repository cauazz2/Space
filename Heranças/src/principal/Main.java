package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.Corrente;
import entidade.Poupanca;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.out.println("Bem vindo ao Banco do Seduc 1");
		
		Scanner entrada = new Scanner (System.in);
		
		List<Conta> lista = new ArrayList<>();
		
		System.out.println("> Quantas contas você deseja cadastrar ?");
		int num_contas_cad = entrada.nextInt();
			
		for(int contador = 1; contador <= num_contas_cad; contador++ ) {
			
			System.out.println(" > Digite o tipo de conta desejada <");
			System.out.println(" (C) para Conta Corrente, (P) para conta Poupança");
			String resposta = entrada.nextLine();
			
			switch(resposta) {
			case "C":
				Scanner entrada1 = new Scanner(System.in);
				System.out.println(">> Digite o nome do responsável pela Conta Corrente : ");
				String nome = entrada1.nextLine();
				System.out.println(">> Digite o numero de identificação da Conta Corrente : ");
				int numero = entrada1.nextInt();
				System.out.println(">> Digite o saldo da Conta : ");
				int saldo = entrada1.nextInt();
				System.out.println(">> Digite o limite da Conta : ");
				int limite = entrada1.nextInt();
				lista.add(new Corrente(nome, numero, saldo, limite));
				break;
				
				case "P":
				Scanner entrada2 = new Scanner(System.in);
				System.out.println(">> Digite o nome do responsável pela Conta Poupança : ");
				String nome_p = entrada2.nextLine();
				System.out.println(">> Digite o numero de identificação da Conta Poupança : ");
				int numero_p = entrada2.nextInt();
				System.out.println(">> Digite o saldo da Conta Poupança : ");
				int saldo_p = entrada2.nextInt();
				lista.add(new Poupanca(nome_p, numero_p, saldo_p));
				break;
				
				default:
				//System.out.println(" * Digite um tipo de conta válido");
				main(null);
				break;
			}
			
			System.out.println(lista);
		}
	}

}
