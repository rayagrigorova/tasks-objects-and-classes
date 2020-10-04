package edu.smg;

import javax.swing.JOptionPane;

public class input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input = JOptionPane.showInputDialog("What's your name?");
		
        //Parse the input as an int.
        //Print its value +1
//	int input = Integer.parseInt(JOptionPane.showInputDialog("Input a number: "));
//	input++;
//	
//	System.out.println(input);
		
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
		
		System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Input a number: ")) + 1);
		
	}

}
