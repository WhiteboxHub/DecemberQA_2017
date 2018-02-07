package com.wbl.basic;

public class BitwiseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//byte i = 4;   //7 6 5 4 3 2 1 0
//                        1 0 0 
//              1 1 1 1 1 0 1 1 ----> -4
//              0 1 1 1 1 1 0 1
//00000100 --- 4
//00000011
//--------
//00000000 ---  &
//00000111
//& |
//&& ||
//  3 & 4 --> 0  
//  3 | 4 --> 7
		//Left Shift & Right shift 
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240
		
		System.out.println(20>>2);//20/2^2=20*4=80  
		System.out.println(15>>4);//15/2^4=15*16=240
		
		//unsigned shift
	    //For positive number, >> and >>> works same  
	    System.out.println("positive number right shift " + (20>>2));  
	    System.out.println("positive number unsigned shift " + (20>>>2));  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println("negative number right shift " + (-20>>2));  
	    System.out.println("negative number unsigned shift " + (-20>>>2)); 
	}
}
/*
  (decimal)    (binary)
     5     =  101
     6     =  110
------------------ xor ^
     3     =  011
     
     
^ | 0 1      ^ | F T
--+-----     --+-----
0 | 0 1      F | F T
1 | 1 0      T | T F
 
*/
