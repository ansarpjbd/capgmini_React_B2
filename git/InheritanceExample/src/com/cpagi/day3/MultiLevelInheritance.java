package com.cpagi.day3;


//MUltiLevel Inheritance --we one class is extends by other class and then that class is extends by other class and so on
class A1
{
	public void printA()
	{
		System.out.println("class A");
	}
}
class B1 extends A1
{
	public void printB()
	{
		System.out.println("class B");
	}
}

class C1 extends B1
{
	public void printC()
	{
		System.out.println("class C");
	}
	
}


class D1 extends C1
{
	public void printD()
	{
		System.out.println("class D");
	}
}

public class MultiLevelInheritance {
	
	
	public static void main(String args[])
	{
     D1 d=new D1();
     d.printA();
     d.printB();
     d.printC();
     d.printD();
    
     
	}

}
