package jSillas;

import java.util.Scanner;

public class TestSillas {
	

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		Silla[][] sillas = new Silla[3][n];
		
		
		for (int i=0;i<sillas.length;i++){
			for(int j=0;j<sillas[i].length;j++){
				sillas[i][j]= new Silla(false);
				sillas[1][0]=null;
				sillas[1][n-1]=null;
				System.out.println(sillas[i][j] +" ");
			}
			System.out.println();
		}
	}

}
