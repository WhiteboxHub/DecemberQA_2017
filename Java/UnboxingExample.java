package com.wbl;

public class UnboxingExample {
public static void main(String[] st){
 
 Integer a=new Integer(10);
 int i=a.intValue();// convert Integer to int
 
 
 int j=a; //unboxing, 
 System.out.println(a+" "+i+" "+j);
}
}
