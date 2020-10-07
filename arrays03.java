package edu.smg;

import java.util.*;

public class arrays03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Създайте програма, която въвежда 10 елемента в масив от конзолата, в
		 * последствие измества всички елементи с една позиция на ляво, а първият
		 * елемент отива в края.
		 */
		final int SZ = 10;
		
		Scanner sc = new Scanner (System.in);
		String [] arr = new String [SZ];
		
		System.out.println("Enter " + SZ + " elements of any type:");
		
		for(int i = 0; i < SZ; i++) {
			arr [i] = sc.next();
		}
		
		String temp = arr[0];
		
		for(int i = 0;i < SZ - 1;i++) {
			arr[i] = arr[i+1];
		}
		
		arr[SZ-1] = temp;
		
		System.out.println("\nYour shifted array is: ");

		for(int i = 0; i < SZ; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}
