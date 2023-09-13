package org.lessons.java.array;

import java.util.Arrays;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] favoriteDishes = new String[7];
		
		favoriteDishes[0] = "Spezzatino di Seitan alla Birra";
		favoriteDishes[1] = "Insalata di carote, rosmarino, semi di sesamo e uovo sodo";
		favoriteDishes[2] = "Sushi";
		favoriteDishes[3] = "Scaloppine al limone";
		favoriteDishes[4] = "Pizza";
		favoriteDishes[5] = "Ravioli ricotta e spinaci";
		favoriteDishes[6] = "Frittatona di cipolle";
		
		System.out.println("La Lunghezza dell'array è di " + favoriteDishes.length);
		
		System.out.println("Il tuo piatto preferito in assoluto è " + favoriteDishes[0]);
		System.out.println("Il tuo piatto meno preferito è " + favoriteDishes[6]);
		System.out.println("Il tuo piatto mediamente preferito è " + favoriteDishes[3]);
		
		
	}
}
