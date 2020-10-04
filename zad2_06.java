package edu.smg;

import javax.swing.JOptionPane;

public class zad2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6.2 Multi Planetary Weight*/
		String [] planets = {"Mercury", "Mars", "Venus","Jupiter", "Saturn", "Uranus", "Neptune"};
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight on Earth"));
		String planetChosen = (String)(JOptionPane.showInputDialog(null, "Choose a planet", "Planet", 2, null, planets, planets[0]));
		
		switch(planetChosen){
		case "Mercury":
			weight*=0.38;
			break;
			
		case "Mars":
			weight*=0.38;
			break;
			
		case "Venus":
			weight*=0.91;
			break;
			
		case "Jupiter":
			weight*=2.36;
			break;
			
		case "Saturn":
			weight*=0.92;
			break;
		case "Uranus":
			weight*=0.89;
			break;
			
		case "Neptune":
			weight*=1.13;
			break;
			
		default: JOptionPane.showMessageDialog(null, "Error");
		}
		weight*=100;
		weight = (int)weight;
		weight/=100;
		
		JOptionPane.showMessageDialog(null, "Your weight on " + planetChosen +" is " + weight);
	}

}
