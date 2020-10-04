package edu.smg;

public class casting01 {
	public static void main(String[] args) {
    //Declare and initialize a byte with a value of 128
    //Observe NetBeans' complaint

//    byte invalidByte = 128;
//  	System.out.println(invalidByte);

    
    //Declare and initialize a short with a value of 128
    //Create a print statement that casts this short to a byte

//		short testCast=128;
//		System.out.println((byte)testCast);
		
    //Declare and initialize a byte with a value of 127
    //Add 1 to this variable and print it
    //Add 1 to this variable again and print it again
		
	byte b = 127;
	
		for(int i=0;i<2;i++){
			b++;
			System.out.println(b);
		}
	}
}
