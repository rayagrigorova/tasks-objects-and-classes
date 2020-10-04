package edu.smg;

import java.util.Scanner;

public class zad4_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(i>j)System.out.print(" ");
				else System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
