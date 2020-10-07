package edu.smg;

import java.util.Scanner;

public class arrays04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Създайте програма, която въвежда ключ с отговори на тест с 10 въпроса и 
//		отговорите
		Scanner sc = new Scanner (System.in);
		
		final int numQuestions = 4;
		final int numStudents = 3;
		
		String [] key = new String [numQuestions];
		String [][] studentAns = new String [numStudents][numQuestions];
		
		System.out.println("Please enter the answer key:");
		
		for(int i = 0; i < numQuestions; i++) {
			key [i] = sc.next();
		}
		
		for(int i = 0; i < numStudents; i++) {
			System.out.println("Please enter student number " + (i+1) +"'s answers:");
			
			for(int j = 0; j < numQuestions; j++) {
				studentAns[i][j] = sc.next();
			}
		}
		
		System.out.println("\n");
		
		
		System.out.format("                ");
		for(int i = 0; i < numQuestions; i++) {
//			System.out.println(key[i]);
			System.out.format("%10s", key[i]);
		}
		System.out.format("\n");
		
		int sum = 0;
		for(int i = 0; i < numStudents; i++) {
			System.out.format("Student number%2d", i + 1);
			
			sum = 0;
			for(int j = 0; j < numQuestions; j++) {
//				System.out.print(studentAns[i][j] + " ");
				System.out.format("%10s", studentAns[i][j]);
				if(studentAns[i][j].equalsIgnoreCase(key[j])) {sum++;}
				
				if(j == numQuestions - 1 ) {
					System.out.format("%11s%d","Score:",sum);
				}
			}
			System.out.format("\n");
		}
		
	}

}
