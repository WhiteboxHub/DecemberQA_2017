package com.wbl;

public class AutoboxingExample {

 public static void main(String[] st)
 {
  int a=20; // intialize variable
  Integer i=Integer.valueOf(a); //converting into Integer
  
  
  Integer j=a; // auto boxing..Integer.valueOf(a) internally...
  
  System.out.println(a+" "+i+" "+j);
  
 }
}
