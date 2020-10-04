package edu.smg;

import javax.swing.JOptionPane;
public class input02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JOptionPane.showMessageDialog(null,
	                "Dont mind me just a message",
	                "Gosho",
	                3);

	        
	        String input1 = (String)JOptionPane.showInputDialog(null,
	                "???",
	                "Goshko",
	                2,
	                null,
	                null,
	                "kaji we");
	        
	        String [] desserts = {"Cake", "Ice cream", "Pancakes", "Waffle", "Donut", "Apple pie"};
	        
	        /*String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};*/
	        String input2 = (String)JOptionPane.showInputDialog(null,
	                "Is this a question?",
	                "Dialog Title",
	                2,
	                null,
	                desserts,
	                desserts[0]);
	}

}
