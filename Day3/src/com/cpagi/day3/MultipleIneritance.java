package com.cpagi.day3;

class Parent1
{

	public void printParent1()
	{
		System.out.println("Print Parent One");
	}
}
class Parent2
{
public void printParent2()
{
	System.out.println("Print Parent two");
}
//Multiple inheritance is not allowed in java 
//Child class can have only one parent class
//if child class tries to access two parents class which is not possible in java
class Child extends Parent1 ,Parent2
{
	public void printChild()
	{
		System.out.println("Child class");
	}
}


}





public class MultipleIneritance {

	
	public static void main(String args[])
	{
		
	}
}
