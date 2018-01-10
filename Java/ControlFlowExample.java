package com.wbl.basics;

import java.util.Scanner;

public class ControlFlowExample {

	public static void main (String args[]) {
		
		ControlFlowExample ifstate = new ControlFlowExample();
		//ifstate.executeSwitch();
		ifstate.useContinue();
		
		/*int a = 15;
		
		int count = 0;
		Scanner in;
		
		//3 - fizz, 5- buzz, number
		
		if ( a%2 ==0 ) {
			System.out.println("a is even");
		}
		else {
			System.out.println("a is odd");
		}*/
		
		//15
	//----------do while------------------	
	/*	System.out.println("Enter a number :");
	  	in=new Scanner(System.in);
		do {
			
			a = in.nextInt();
			
			count++;
		   if(a%3==0 && a%5 == 0) {
			System.out.println("fizzbuzz");
		   }
		   else if ( a%3 ==0 ) {
			System.out.println("fizz");
		   }
		   else if(a%5==0) {
			System.out.println("buzz");
		   }
		   else
			System.out.println(a);
		}while(count<=3);
		
		System.out.println("Out of loop.............");
		in.close();
		
		
		System.out.println("Enter a number :");
		in=new Scanner(System.in);
		
		while(count<3) {
			
		   a = in.nextInt();
			count++;
		   if(a%3==0 && a%5 == 0) {
			System.out.println("fizzbuzz");
		   }
		   else if ( a%3 ==0 ) {
			System.out.println("fizz");
		   }
		   else if(a%5==0) {
			System.out.println("buzz");
		   }
		   else
			System.out.println(a);
		}
		
		System.out.println("Out of loop.............");
		in.close();
			
		*/
	}
	
	void executeFor() {
		int a ;
		
		Scanner in;
		
		System.out.println("Enter a number :");
		in=new Scanner(System.in);
		
		for(int count=0; ; count++) {
			
		   a = in.nextInt();
		   if(a==0) break;
		   	   
		 if(a%3==0 && a%5 == 0) {
			System.out.println("fizzbuzz");
		   }
		   else if ( a%3 ==0 ) {
			System.out.println("fizz");
		   }
		   else if(a%5==0) {
			System.out.println("buzz");
		   }
		   else
			System.out.println(a);
		 
		 if(count <3) continue;
		   
		}
		
		System.out.println("Out of loop.............");
		in.close();
		
	}
	//print 1 to 100 using the fizz buzz logic  - instead of a use count
	
	
	void executeSwitch()
	{
		/*for(int i=1; i<=3; i++) {
			
			switch(i) {
			case 1 : System.out.println("one"); break;
			case 2 : System.out.println("two");  break;
			case 3 : System.out.println("three"); break;
			default : System.out.println("no number");
			}
		System.out.println("--------------");
	   }*/
		  int countVowel=0;
		  int countCons=0;
          for(char i='a'; i<='z'; i++ ) {
			
			switch(i) {
			case 'a' : 
			case 'e' : 
			case 'i' : countVowel++; break;
			default : countCons++;
			}
		
	   }
		
		System.out.println("vowels = "+countVowel);
		System.out.println("conso = "+countCons);
		
		
	}
	
	
	public void useContinue() {
		for( int a = 1; a <=100; a++) {   // in break control will come out of the block in which it is defined
			                              // continue is used in loops to skip below statement and go to next iterative step
			if (!(a%3==0 || a%5==0 )) {
			    System.out.print(a+"\t");
			    continue;
			}
			
			 if(a%3==0 && a%5 == 0) {
					System.out.print("fizzbuzz \t");
				   }
				   else if ( a%3 ==0 ) {
					System.out.print("fizz \t");
				   }
				   else if(a%5==0) {
					System.out.print("buzz \t");
				   }
	          if (a %10 ==0) System.out.println();
		}
		
	}
	

}
