package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();
		
		System.out.print("Nome do aluno: ");
		estudante.nome = sc.nextLine();
		System.out.print("Nota 1º Trimestre: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2º Trimestre: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3º Trimstre: ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", estudante.media());
		
		if (estudante.media() >= 60) {
			System.out.println("PASSOU!");
		}
		else {
			System.out.println("REPROVADO!");
			System.out.printf("Faltou %.2f pontos", estudante.reprovado());
		}
		
		sc.close();
	}

}
