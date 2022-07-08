package br.com.generation.lista;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.
		
		int num1;
		int num2;
		int num3;
		
		int maiorNum;
		int meioNum;
		int menorNum;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		
		if((num1 > num2 && num1 > num3) || (num1 == num2 && num1 == num3 )) {
			maiorNum = num1;			
			
		}
			
		else if((num2 > num3) || (num2 == num3 )) {
			maiorNum = num2;
		}
		
		else  {
			maiorNum = num3;
		
			
		}}}
			
		
		
	


