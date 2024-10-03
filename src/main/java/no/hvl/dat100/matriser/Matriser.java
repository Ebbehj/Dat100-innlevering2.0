package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			System.out.println(" ");
			System.out.println(" ");
			for (int j = 0; j < matrise[i].length; j++) {

				System.out.print(matrise[i][j] + " ");

			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String matrise1 = "";
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				matrise1 = matrise1 + String.valueOf(matrise[i][j]) + " ";
				if (matrise[i].length == j + 1) {
					matrise1 = matrise1 + "\n";
				}
			}
		}

		
		return matrise1;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] matrise3 = new int[matrise.length][];
		

		for (int i = 0; i < matrise.length; i++) {
            matrise3[i] = new int [matrise[i].length];
            
			for (int j = 0; j < matrise[i].length; j++) {

				matrise3[i][j] = (matrise[i][j]) * tall;

			}

		}
		return matrise3;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
    boolean erLik = true;
		int i = 0;
	while( i < a.length && erLik == true) {
		
		 for(int j=0; j< a[i].length; j++ ) {
			 if(b[i][j] != a[i][j]) {
				 erLik = false;
				 break;
			 }
			 
		 }
	 }System.out.println(erLik);
    return erLik;
	}

	// e)
public static int[][] speile(int[][] matrise) {
		
		
		
		int[][] matrise2 = new int[matrise.length][];
		
	
		for (int i=0 ; i< matrise.length; i++) {
	       matrise2[i] = new int[matrise[i].length];
	       
	       
		   for(int j = 0; j < matrise[i].length; j++) {
			  matrise2[i][j] = matrise[j][i];
			  
		   
		   
		   }
		   
		   }
		System.out.println("  "+Arrays.toString(matrise2[0]));   	
		System.out.println("  "+Arrays.toString(matrise2[1]));
		System.out.println("  "+Arrays.toString(matrise2[2]));
		return matrise2;}	
		    	
	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
