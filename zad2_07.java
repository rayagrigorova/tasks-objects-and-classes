package edu.smg;

import javax.swing.JOptionPane;

public class zad2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tuition = 10_000;
		double sum = 0;
		
		for(int i=0;i<10;i++) {
			tuition += tuition * 0.06;
		}
/*		Suppose that the tuition for a university is $10,000 this year
		and increases 6% every year. In one year, the tuition will be $10,600.
		Write a program that computes the tuition in ten years and the total 
		cost of four years’ worth of tuition after the tenth year.*/
		System.out.println("The tuition in ten years will be " + ( (int) ( Math.round (tuition * 100) ) / 100.0) + " $");
		
		for(int i=0;i<4;i++) {
			sum+=tuition;
			tuition += tuition * 0.06;
		}
		System.out.println("The total cost of four years’ worth of tuition after the tenth year is " + 
		( (int) (Math.round (sum * 100) ) / 100.0 ) + " $");
	}

}
