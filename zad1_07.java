package edu.smg;

import java.util.Arrays;
import java.util.regex.Pattern;

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
		
		for(int i = 0; i < word_1.length();i++){
			if(Pattern.matches("\\p{Punct}", String.valueOf(word_1.charAt(i)))){
				String ch = String.valueOf(word_1.charAt(i));
//				System.out.println(ch);
				word_1 = word_1.replaceAll(ch, "");
				
			}
		}
		
		for(int i = 0; i < word_2.length();i++){
			if(Pattern.matches("\\p{Punct}", String.valueOf(word_2.charAt(i)))){
				String ch = String.valueOf(word_2.charAt(i));
				/*System.out.println(ch);*/
				word_2 = word_2.replaceAll(ch, "");
				
			}
		}
		
		word_1 = word_1.replaceAll("\\s", "");
		word_2 = word_2.replaceAll("\\s", "");
		
		word_1 = word_1.toLowerCase();
		word_2 = word_2.toLowerCase();
		
		
		if(word_1.length()!=word_2.length()){JOptionPane.showMessageDialog(null, "The word is NOT an anagram");}
		
		else{
			final int LEN = word_1.length();
			
			boolean[] mask = new boolean[LEN];
			Arrays.fill(mask,false);
			
			for(int i=0;i<LEN;i++){
				for(int j=0;j<LEN;j++){
					if(word_1.charAt(i) == word_2.charAt(j) && mask[i] == false){
						mask[i] = true;
					}
				}
			}
			boolean isAnagram = true;
			for(int i=0;i<LEN;i++){if(!mask[i]){isAnagram = false; break;}}
			
			if(isAnagram)JOptionPane.showMessageDialog(null, "The word IS an anagram");
			else {JOptionPane.showMessageDialog(null, "The word is NOT an anagram");}
		}
		

	}

}
