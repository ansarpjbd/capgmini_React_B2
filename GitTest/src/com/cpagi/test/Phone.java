package com.cpagi.test;

import java.util.ArrayList;

//Creating the class here 
//One java file can have multiple classes
//There will be only one class as public
//Public class name should same as File name
//Data Hiding (Encapsulation)
//class is blueprint 
class SmartPhone
{
	//
	private int sr;
	private int modelNumber;
	private String brand;
	
	//setter
	
	 public void setSr(int sr) { this.sr=sr; }
	 public void getSr() { System.out.println(sr); }
	 
    
	/*
	 * public void getSr() { System.out.println(this.sr); }
	 */
	
	//Constructor 
	
}

//Data will belong to Object type only


//to execute a program
//Helping class where we will create object and use the method
public class Phone {

	public static void main(String args[])
	{
		
		ArrayList ls=new ArrayList();
		int id;
		id=10;
		
		SmartPhone A1=new SmartPhone();
		//A1.brand="Sumsung";
		//A1.sr=10;
		//A1.modelNumber=100;
		A1.setSr(100);
		A1.getSr();
		
		
	}
	
}
