package edu.smg;

import javax.swing.JOptionPane;

public class zad1_06 {
	public static void main(String[] args) {
		/*6.1 Color Range*/
		double colorCode = Double.parseDouble(JOptionPane.showInputDialog("Enter a color code"));
		
		String res = "";
		
		if(colorCode >= 380 && colorCode <= 450){res="Violet";}
		else if(colorCode >= 450 && colorCode <= 495){res="Blue";}
		else if(colorCode >= 495 && colorCode <= 570){res="Green";}
		else if(colorCode >= 570 && colorCode <= 590){res="Yellow";}
		else if(colorCode >= 590 && colorCode <= 620){res="Orange";}
		else if(colorCode >= 620 && colorCode <= 750){res="Red";}
/*			380-450 violet 
			450-495 blue
			495-570-green
			570-590-yellow 
			590- 620 orange
			620-750-red*/
		if(res.equals("")) JOptionPane.showMessageDialog(null,"The entered wavelength is not a part of the visible spectrum");
		else JOptionPane.showMessageDialog(null, "The color is " + res);
	}
	
}
