package edu.smg;

import java.util.*;
import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Създайте програма, която пита потребителя за 10 елемента, в последствие ги
		 * разбърква произволно и извежда в конзолата.
		 */
		
		Scanner sc = new Scanner (System.in);
		Random rand  = new Random ();
		System.out.println("Pleas enter 10 elements of any type ");
		
		String [] arr = new String [10];
		int newIndexes [] = new int [10];
		
		for(int i = 0; i < 10; i++ ) {
			arr [i] = sc.next();
			}
		
		for(int i=0; i<10; i++) {
			int swapIndex = rand.nextInt(arr.length);
			
			String temp = arr [swapIndex];
			arr[swapIndex] = arr[i];
			arr[i] = temp;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}	
		
}

