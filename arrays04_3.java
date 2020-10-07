package edu.smg;

import java.util.Random;

public class arrays04_3 {

	public static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		final int ROWS = random.nextInt(5) + 3;
		final int COLS = random.nextInt(5) + 3;

		int[][] arr1 = new int[ROWS][COLS];
		int[][] arr2 = new int[COLS][ROWS];

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				arr1[i][j] = random.nextInt(1+20)+2;
			}
		}
//		1 2 3 
//		4 5 6 
//		r = 2  c = 3
//		1 2
//		3 4
//		5 6
		// r = 3 c = 2
		System.out.println("Rows: "+ ROWS + " Columns: " + COLS);
		
		System.out.println("\nYour matrix:");
		printMatrix(arr1);

		

		 for(int i = 0; i < COLS; i++) { 
			 for(int j = 0; j < ROWS; j++) { 
				 arr2[i][j] = arr1[j][i]; 
			 }
		}
		 
		System.out.println("\nTransposed matrix:");
		printMatrix(arr2);
		 

	}

}
