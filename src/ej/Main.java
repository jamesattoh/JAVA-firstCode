package ej;

import java.util.Arrays;
import java.util.List;

public class Main { //code minimal de tout projet java

	public static void main(String[] args) { //point d'entree de tout projet java 
		
		
		String phrase = "Hello world !";
		System.out.println(phrase);
		
		int somme = Main.addition(10, 45);
		System.out.println(somme);
		
		System.out.println(Main.addition(19, 2) + 45);
		
		Main.Decompte(5);
		
		System.out.println("And now, let's work on Fibonacci terms");

		System.out.println(Main.niemeFibonacciTerme(4));
		
		System.out.println(Main.niemeFibonacciTerme2(-5));

		Main.affiche("Marius");
		
		
		List<String> bestFriends = Arrays.asList("Marius", "Espoir", "RamaDan", "KENNY");
		
			for(String bestFriend : bestFriends) {
				String resultat = bestFriend.toUpperCase();
				
				System.out.println(resultat);

			}
			
		//deuxieme exo : sur les tableau
		int [] tableau = {26, 10, 1985, 0, 12, 11, 0};
		int cpt = 0;
		
		for(int i = 0; i < tableau.length; i++) {
			if(tableau[i] == 0) {
				cpt ++;
			}
		}
		System.out.println( cpt);
	}

	
	public static int addition(final int entier1, final int entier2)
	{
		return entier1 + entier2;
	}
	
	
	// 1ere fonction recursive
	public static void Decompte(final int entier)
	{
		if (entier >= 0 ) {
			System.out.println(entier);
			Decompte(entier - 1);
		}
	
	}
	
	//fibonacci recursive method
	public static int niemeFibonacciTerme(int n)
	{
		if (n == 0 || n == 1) {
			return 1;
		}
		return niemeFibonacciTerme(n-1) + niemeFibonacciTerme(n - 2);
	}
	
	
	//fibonacci iterative method
	public static int niemeFibonacciTerme2(int n)
	{
		if (n == 0 || n == 1) {
			return 1;
		}
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	//exo sur les fonctions
	public static void affiche(String name)
	{
		System.out.println("Bonjour " + name);
	}
}
