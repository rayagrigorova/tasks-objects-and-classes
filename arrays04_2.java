package edu.smg;

import java.util.*;

public class arrays04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Създайте програма, която запълва от конзолата матрица 5 х 5. Изведете на кой
		 * ред се намира най-голямата сума на числа.
		 */
		final int N = 3;
		Scanner sc = new Scanner (System.in);
		int [][] arr = new int [N][N];
		
		System.out.println("Please enter " + (N*N) + " numbers: ");
		
		int [] sums = new int [N];
		int sum;
		
		for(int i = 0; i < N; i++) {
			sum = 0;
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
				sum +=arr[i][j];
			}
			sums [i] = sum;
		}
		
		sum = sums[0];
		int ind = 0;
		
		for(int i = 0; i < N; i++) {
			if(sums[i]>sum) {sum = sums [i]; ind = i;}
		}
		
		System.out.println("\nYour array:");
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Biggest sum: " + sum + " for row " + ind);
	}

}
