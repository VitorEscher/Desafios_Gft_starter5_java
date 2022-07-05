package br.com.gft.desafio1;

import java.util.Scanner;

public class Financiamento {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Diga o valor do carro:");
		double valor = scan.nextDouble();
		
		precoFinal(valor);

	}

	private static void precoFinal(double valor) {
		System.out.println("Digite método pagamento: a vista (1) / parcelado (2)");
		Scanner scan = new Scanner(System.in);
		double metodo = scan.nextInt();
		if(metodo == 1) {
			double valorComDesconto = valor - (valor * 0.2);
			System.out.printf("valor com desconto = "+ valorComDesconto);
		} else if(metodo == 2) {
			System.out.println("Qual opção de parcelamento (vezes)? 6, 12, 18, 24 ou 30?");
			int opcaoParcelado = scan.nextInt();
			switch (opcaoParcelado) {
			case 6: {
				double valorFinal = valor * 1.03;
				double valorParcela = valorFinal / opcaoParcelado; 
				System.out.printf("valor da final = " + valorFinal + "Parcelamento = " + opcaoParcelado + "valor Parcela = " + valorParcela);
			}
			case 12: {
				double valorFinal = valor * 1.06;
				double valorParcela = valorFinal / opcaoParcelado;
				System.out.printf("valor da final = " + valorFinal + "Parcelamento = " + opcaoParcelado + "valor Parcela = " + valorParcela);
			}
			case 18: {
				double valorFinal = valor * 1.09;
				double valorParcela = valorFinal  / opcaoParcelado;
				System.out.printf("valor da final = " + valorFinal + "Parcelamento = " + opcaoParcelado + "valor Parcela = " + valorParcela);
			}
			case 24:{
				double valorFinal = valor * 1.12;
				double valorParcela = valorFinal  / opcaoParcelado;
				System.out.printf("valor da final = " + valorFinal + "Parcelamento = " + opcaoParcelado + "valor Parcela = " + valorParcela);
			}
			case 30: {
				double valorFinal = valor * 1.15;
				double valorParcela = valorFinal  / opcaoParcelado;
				System.out.printf("valor da final = " + valorFinal + "Parcelamento = " + opcaoParcelado + "valor Parcela = " + valorParcela);
			}
			default:
				System.out.println("numero de parcelas invalidas!");
			}
		}
		
	}
}