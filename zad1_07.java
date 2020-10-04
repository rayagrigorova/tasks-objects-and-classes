package edu.smg;

import java.util.Arrays;

import javax.swing.*;


public class zad1_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1 An anagram is a word or a phrase made by transposing
		the letters of another word or phrase; for example,
		"parliament" is an anagram of "partial men," and "software"
		is an anagram of "swear oft." Write a program that figures
		out whether one  string is an anagram of another string. 
		The program should ignore white space and punctuation.*/
		JTextField txt_1 = new JTextField(15);
		JTextField txt_2 = new JTextField(15);
		
		JPanel myPanel = new JPanel();
		
		myPanel.add(new JLabel("Word 1:"));
		myPanel.add(txt_1);
		
		myPanel.add(new JLabel("Word 2:"));
		myPanel.add(txt_2);
		
		JOptionPane.showConfirmDialog(null, myPanel,"Enter two words:" ,JOptionPane.OK_CANCEL_OPTION);
		
		String word_1 = txt_1.getText();
		String word_2 = txt_2.getText();
		
		word_1 = word_1.replaceAll("\\s", "");
		word_2 = word_2.replaceAll("\\s", "");
		
		word_1.toLowerCase();
		word_2.toLowerCase();
		
		
		if(word_1.length()!=word_2.length()){JOptionPane.showMessageDialog(null, "The word is NOT an anagram");}
		
		else{
			final int LEN = word_1.length();
			
			boolean[] mask = new boolean[LEN];
			Arrays.fill(mask,false);
			
			for(int i=0;i<LEN;i++){
				for(int j=0;j<LEN;j++){
					if(word_1.charAt(i) == word_1.charAt(j) && mask[j] == false){
						mask[j] = true;
					}
				}
			}
			boolean isAnagram = true;
			for(int i=0;i<LEN;i++){if(!mask[i]){isAnagram = false; break;}}
			
			if(isAnagram)JOptionPane.showMessageDialog(null, "The word IS an anagram");
			else if(word_1.length()!=word_2.length()){JOptionPane.showMessageDialog(null, "The word is NOT an anagram");}
		}
		

	}

}
