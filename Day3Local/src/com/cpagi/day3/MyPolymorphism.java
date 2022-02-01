package com.cpagi.day3;

//it can take any form at runtime time 

//Need to implement abstraction class or interface
//Concept of inheritance (implement the interface or extends)
//it should have same method name in parent and child class
//you need to override the method in the child child
//it will always run the child class method

//late binding
//Method Overriding 


class Shape {

	public void drawShape() {
		System.out.println("Draw Shape");
	}

}

class Line extends Shape {
	public void drawShape() {
		System.out.println("Line");
	}
}

class Circle extends Shape {
	public void drawShape() {
		System.out.println("Circle");
	}
}

public class MyPolymorphism {

	public static void main(String args[]) {
		// Parent class // child class
		// parent class hold the object of child class
		Shape s = new Circle();
		s.drawShape();
	}
}
