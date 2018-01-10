package com.wbl.basics;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // new ArrayExample().useArrays();
		new ArrayExample().multiArray();
	}
	
	//   accessmodifier   returntype  methodname(datatype argVariable1, datatype argvariable2,...)
	
	public void useArrays() {
		
		int marks[]= {65, 89, 93, 100, 99};
		
		//marks = new marks[] { 65, 89, 93, 100, 99};

		/*for(int i = 0 ; i < marks.length ; i++)
		  // System.out.println( marks[i]);
			 System.out.print( marks[i]+"\t");
		*/
		
		for (int a : marks)
			System.out.println(a);
	}
	
	
    public void multiArray() {
    	
    	//int marks[][] = new marks[5][3];
    	int marks[][] = {{45,50,34}, {34,45,12}, {34,35,45}, {35, 44,50}, {22, 29, 35}};
    	//marks[0].length
    	
    	
    	for(int row =0; row < marks.length; row++) {
    		for(int col=0; col < marks[row].length; col++) {
    			System.out.print(marks[row][col] + "\t");
    		}
    		System.out.println();
    	}
    	
    	
    	
    }

}


//javac file.java -----> file.class
//java file  
// java file decemberbatch  sepbatch



