package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE OS DADOS DO 1º CAMPEÃO: ");
		System.out.println("NOME: ");
		String name = sc.nextLine();
		
		System.out.println("Vida inicial: ");
		int life = sc.nextInt();
		
		System.out.println("ATAQUE: ");
		int attack = sc.nextInt();
		
		System.out.println("ARMADURA: ");
		int armor = sc.nextInt();
		Champion champion1 = new Champion(name, life, attack, armor);
		System.out.println();
		
		System.out.println("DIGITE OS DADOS DO 2º CAMPEÃO: ");
		System.out.println("NOME: ");
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("VIDA INICIAL: ");
		life = sc.nextInt();
		
		System.out.println("ATAQUE: ");
		attack = sc.nextInt();
		
		System.out.println("ARMADURA: ");
		int armor = sc.nextInt();
		Champion champion2 = new Champion(name, life, attack, armor);
		System.out.println();
		
		System.out.println("QUANTOS TURNOS VOCÊ QUER EXECUTAR? ");
		int rounds = sc.nextInt();
		
		for ( int i = 0; i < rounds; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			System.out.println();
			System.out.println("===== RESULTADO DO TURNO =======" + (i + 1) + ":");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			
			if(champion1.getLife() == 0 || champion2.getLife() == 0) {
				i = rounds;
			}
		}
		
		System.out.println();
		System.out.println("===== FIM DO COMBATE ======");
		
		
		sc.close();

	}

}
