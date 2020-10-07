package edu.smg;
import java.util.*;
public class arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Създайте програма, която запълва масив с 20 произволни елемента и извежда
		 * резултата в конзолата.
		 */
		final int SZ = 20;
		
		int arr [] = new int[SZ];
		
		for(int i = 0; i < SZ; i++){
			arr [i] = new Random().nextInt(2_147_483_646 + 1);
			arr [i]	*= ((new Random().nextInt(1 + 1) + 1 == 1)? -1 : 1);
		}
		
		System.out.println("Your array:");
		
		for(int i = 0; i < SZ; i++){
			System.out.print(arr[i] + "  ");
		}
		
	}
}
