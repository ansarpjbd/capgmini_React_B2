package com.cpagi.day5;


//Wrapper Class
//It is same as primitive data
//it helpus to convert from one datatype to another datatype
//int

//float

//double

//boolean


public class MyAutoBoxingAndUnboxing {

	public static void main(String arg[])
	{
		
		Float f=new Float(100);
		
		Boolean b=new Boolean(false);
		
		Character c=new Character('c');
		
		Byte byte1=new Byte("abc");
		
		Long longs=new Long(10);
		
		Short shorts=new Short((short) 1);
		//shorts.
		 int abc=10;
		 //int to string converation
		 String str1=String.valueOf(abc);
		
		
		//Integer wrapper class
		//it is same as int but it is class
		//it has some method
		int a=10;
		Integer i=new Integer(10);
		//convert from primitive data type wrapper
		
		i=a;
		
		String str="10";
		//method class name 
		i=Integer.parseInt(str);
		
		//Integer
		System.out.println(Integer.compare(a, a));
		
		//max of two number
		System.out.println(Integer.max(10, 20));
		
		//sum of two number
		System.out.println(Integer.sum(100, 20));
		
		//Integer.
		
		i=i+10;
		//System.out.println(i);
		
		
	}
}
