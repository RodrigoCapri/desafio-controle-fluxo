package application;

import java.util.Locale;
import java.util.Scanner;

import application.exceptions.ParametrosInvalidosException;

public class Contador {

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		//Se o parametroUm é maior que o parametroDois, lança uma exceção
		if( parametroUm > parametroDois ) {
			throw new ParametrosInvalidosException("Erro!\nO primeiro parametro deve ser menor que o segundo parametro.");
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int i=1; i<=contagem; i++) {
			System.out.printf("Imprimindo numero %d\n", i);
		}
		
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try( Scanner terminal = new Scanner(System.in) ){
			
			System.out.print("Digite o primeiro parametro: ");
			int parametroUm = terminal.nextInt();
			
			System.out.print("Digite o segundo parametro: ");
			int parametroDois = terminal.nextInt();
			
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
