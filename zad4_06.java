package edu.smg;

import javax.swing.*;

public class zad4_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that calculates the number of buckets of paint to use for a
		 * room and the optimal number of cans to purchase. You need to ask the height
		 * of the room and the length and width of the room. The room is rectangular.
		 * You must paint the walls and the ceiling but not the floor. There are no
		 * windows or skylights. You can purchase the following size buckets of paint. •
		 * 5-liter bucket costs $15 each and covers 140 square meters.
		 *  • 1-liter bucket
		 * costs $4 and covers 30 square meters.
		 */
		JTextField heightField = new JTextField(5);
		JTextField lengthField = new JTextField(5);
		JTextField  widthField = new JTextField(5);
		
		JPanel myPanel = new JPanel();
		
		myPanel.add(new JLabel("length:"));
		myPanel.add(lengthField);
		myPanel.add(Box.createHorizontalStrut(10));
		
		myPanel.add(new JLabel("width:"));
		myPanel.add(widthField);
		myPanel.add(Box.createHorizontalStrut(10));
		
		myPanel.add(new JLabel("height:"));
		myPanel.add(heightField);
		myPanel.add(Box.createHorizontalStrut(10));
		
		JOptionPane.showConfirmDialog(null, myPanel, "Please enter values for the room height, length and width:", JOptionPane.OK_CANCEL_OPTION);
		
		double h = Double.parseDouble(heightField.getText());
		double l = Double.parseDouble(lengthField.getText());
		double w = Double.parseDouble(widthField.getText());
		
		double S = 2*(h*l+h*w)+l*w;
		
		/*
		 * 5 L-$15 each and covers 140 square meters. 1 L-$4 and covers 30 square
		 * meters.
		 */
		// 
		int fiveLiter = 0 , oneLiter = 0;
		
		//три варианта
		// -само 5 литрови - ако остатъкът при деление на 140 е >= 112,5  
		// смесено -ако остатъкът при деление на 140 е <= 112,5  и числото което се получава е >=1
		//само  1 л- ако остатъкът при деление на 140 е <= 112,5  и числото което се получава е = 0
		
		if(S % 140.0 >= 90) {fiveLiter =(int)(Math.ceil(S / 140.0));}
		else {fiveLiter =(int)(Math.floor(S / 140.0)); oneLiter = (int)(Math.ceil((S-fiveLiter*140)/30));}
//		else oneLiter =(int) Math.ceil(S/30);
		// else if ((int)(Math.floor(S / 140.0)) 
		
		
		JOptionPane.showMessageDialog(null, "The area to paint is " + S + ". Number of  5-liter buckets needed: " + fiveLiter + " Number of  1-liter buckets needed: " +oneLiter);
		
		
	}

}
