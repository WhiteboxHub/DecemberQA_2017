package com.java.wbl;

//import java.lang.Object;

public class Inheritance {
	
	public static void main(String args[]){
		
		DeveloperNew d = new DeveloperNew("DecBatch");
		//DeveloperNew d1 ;
		System.out.println("Salary :: " + d.salary);
		System.out.println("bonus :: " + d.bonus);
		System.out.println("min Hours Worked :: " + d.minHrsWorked);
		System.out.println("Name :: " + d.name);
		//System.out.println("Equals :: " + d.equals(d1));
		
	
	}
	

}
 class EmployeeNew { //extends java.lang.Object
	String name;
	int salary = 3000;
	int totSal;
	static String companyName="Whitebox Learning";
    final int noOfShares;
	
	EmployeeNew(){
		System.out.println("inside emplyee default constr");
		noOfShares = 10;
	}
    EmployeeNew(String name){
    	this.name = name;
    	System.out.println("inside emplyee name constr");
    	noOfShares = 10;
    }
    
    void calcSalary(){
    	totSal = salary +100;
    	System.out.println("Total salary in Super class = "+totSal);
    
    }
     void calcSalary(int conveyance){
    	totSal = salary +conveyance;
    	System.out.println("Total salary in Super class = "+totSal);
    	}

    
}

class DeveloperNew extends EmployeeNew {
	int bonus = 1000;
	int minHrsWorked = 40; 
		
	
	DeveloperNew() {
		//invoke the super class's default constructor
		System.out.println("inside developer default constr");
	}
	
	DeveloperNew(String name){
		//invoke the super class's default constructor
		super(name);
    	 System.out.println("inside developer name constr");
    	 System.out.println("Name from super class :: " + super.name); 
    	 //name-local variable , this.name = DeveloperNew name, super.name=EmployeeNew name
    	// calcSalary();
    }
	
	
	void calcSalary(int conveyance){
		totSal = salary + conveyance + bonus;
		System.out.println("Total salary in Child class = "+totSal);
	}
	
	
}
