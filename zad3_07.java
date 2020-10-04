package edu.smg;

import java.util.Scanner;

public class zad3_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int current = rows;
		int temp;
		
		for(int i=0;i<rows;i++) {
			temp = current + 1;
			
			for(int j=0;j<current*2-1;j++) {
				if(j<current)temp--;
				else temp++;
				
				System.out.print(temp + " ");
			}
			System.out.print("\n");
			current--;
		}
	}
}
