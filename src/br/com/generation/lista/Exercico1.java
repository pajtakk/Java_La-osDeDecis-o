package br.com.generation.lista;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int num1;
		int num2;
		int num3;
		int maiorNum;
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		
		entrada.close();
		
		
		
		if((num1 > num2 && num1 > num3) || (num1 == num2 && num1 == num3 )) {
			maiorNum = num1;			
			
		}
			
		else if((num2 > num3) || (num2 == num3 )) {
			maiorNum = num2;
		}
		
		else  {
			maiorNum = num3;
		
		}
		
		
		System.out.println("O maior número entre eles é; " + maiorNum);
		
	}

}
