/*package edu.smg;

import java.util.Arrays;
import java.util.Scanner;

public class arrays05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Създайте програма, която проверява дали дадена матрица е решение на Судоку пъзел. 
//		Всеки ред и всяка колона трябва да съдържат всички числа от 1 до 9, 
//		всяка клетка 3х3 трябва да съдържа всички числа от 1 до 9.
		Scanner sc = new Scanner (System.in);

		
		final int ROWS = 9;
		final int COLS = 9;
		
		int arr[][] = new int [ROWS][COLS];
		
		System.out.println("Please enter the numbers:");
		
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLS; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int maskRows[] = new int [COLS];
		int mask3x3[][] = new int [3][3];
		
		boolean solved = true;
		for(int i = 0; i < ROWS && solved; i++) {
			//For each row of the sudoku, we check if it contains all numbers 1-9
			Arrays.fill(maskRows, 0);
			//we fill the mask with 0s. The mask[0] represents if there is a 1 in the row
			for(int j = 0; j < COLS; j++) {
				if(arr[i][j] == 0) {solved = false; break;}
				//if we find a 0, we are sure that the sudoku is not solved
				else{
					maskRows[arr[i][j]-1]+=1;
					if(maskRows[arr[i][j]-1]>1){solved = false; break;}
					//we increase the count of the occurances of the number in the row with 1
					//if it becomes more than 1, the solution is not valid
				}
			}
			for(int q = 0; q < COLS; q++) {
				if(maskRows[q]==0) {solved = false; break;}
			}
		}
		//check if each 3x3 box contains numbers 1-9
		for(int  i = 0; i < 9; i++){
			Arrays.fill(mask3x3, 0);
			for(int j =  i / 3; j < i / 3 + 3; j++){
				for (int k = i * 3; k < i * 3 + 3; k++){
					if(arr[j][k] == 0) {solved = false; break;}
					//if we find a 0, we are sure that the sudoku is not solved
					else{
						mask3x3[j][k]+=1;
						if(mask3x3[j][k]>1){solved = false; break;}
				}
			}
		}
		
		
		
		
		
	}

}
*/