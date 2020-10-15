package edu.smg;

import java.util.Arrays;
import java.util.Scanner;

public class arrays05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SZ = 9;
		int solution[][] = new int [SZ][SZ];
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Please enter your sudoku solution:");
		for(int i  = 0; i < solution.length;i++) {
			for(int j  = 0; j < solution[i].length; j++) {
				solution[i][j] = sc.nextInt();
			}
		}
		//Masks are used in order to determine whether each row, col and 3x3 square contains numbers 1-9
		int maskRow [] = new int [SZ];
		int maskCol [] = new int [SZ];
		int mask3x3 [] = new int [SZ];
		
		boolean solved = true;
		for(int i = 0; i < solution.length && solved; i++) {
			//In order to decrease time complexity, we check for the i-th row and column at once
			Arrays.fill(maskRow, 0);
			Arrays.fill(maskCol, 0);
			for(int  j = 0; j < solution[i].length && solved; j++) {
				//If the given solution contains a 0, it is invalid 
				if(solution[i][j] == 0 || solution[j][i] == 0) {
					solved = false;
					break;
				}
				//We increase the mask [number on current index-1] with one
				//If the number on the index is 1 for example, we increase
				//the mask on the 0th position by 1. 
				maskRow[solution[i][j]-1]++;
				maskCol[solution[j][i]-1]++;
				
				//The mask at any position being > 1 indicates that the solution is false
				if(maskRow[solution[i][j]-1]>1 || maskCol[solution[j][i]-1]>1) {
					solved = false;
					break;
				}
				
			}
			//After we are done counting the occurances of numbers in the column, we check if the masks contain 
			//1s exclusively
			for (int k = 0; k < SZ; k++) {
				if(maskRow[k]!=1 || maskCol[k]!=1) {
					solved = false; 
					break;
				}
			}
		}
		
		
		//Now we check if each 3x3 box contains all numbers 1-9 
		//The starting row is 0 for the first 3 boxes and then increases by 3 for every three boxes
		//The starting column is 0 and increases by 3 for every box. Then, after the third box in a group of 3
		//it is reduced back to zero.
		//So we will need 3 for loops 
		
		//For each box
		for (int i = 0; i < SZ && solved;i++) {
			Arrays.fill(mask3x3, 0);
			
			//This loop represents the rows
			//The starting row for the first 3 boxes is 0 and the end row is 2
			// For the next 3 respectively 3 and 5 and so on.
			//We can calculate the starting row by i / 3 (returning 0, 1 and 2 for each group of 3 boxes)
			//which we then * 3 (returning 0, 3 and 6)
			// j < (i / 3) * 3 + 3 assures that we check 3 columns 
			
			//  First row index      Box number (Numbering starting at 0)  
			//         0                  0,1,2
			//         3				  3,4,5
			//         6				  6,7,8

			for (int j = (i / 3) * 3; j < (i / 3) * 3 + 3 && solved; j++) {

				//This loop represents the columns
				//The starting column for the first three boxes is 0, 3 and 6
				//Same goes for the next three 
				
				//  First column index      Box number (Numbering starting at 0)  
				//         0                  0,3,6
				//         3				  1,4,7
				//         6				  2,5,8
				for(int k  = (i % 3) * 3; k < (i % 3) * 3 + 3; k++) {
					if(solution [j][k]==0) {
						solved = false;
						break;
					}
					
					mask3x3[solution[j][k]-1]++;
					
					if(mask3x3[solution[j][k]-1]>1){
						solved = false;
						break;
					}
				}
			}
			for(int z = 0; z < SZ; z++) {
				if(mask3x3[z]!=1){
					solved = false; 
					break;
				}
			}
		}
			
		System.out.print("\n\n");
		if(solved)System.out.println("The sudoku is solved");
		else System.out.println("The sudoku isn't solved");

	}
	

}
