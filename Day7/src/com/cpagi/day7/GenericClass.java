package com.cpagi.day7;

//Generic class --

//we can pass the type of variable while creating the object
//T,V,Z will contain the data type
//declare the class variable with given type
//change the other place with same data type 
class Person<T, V, Z> {
	private T name;
	private V id;
	private Z salary;

	public Person(T name, V id, Z salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void printPerson() {
		System.out.println(" Name " + this.name);
		System.out.println(" ID   " + this.id);
		System.out.println("Salary " + this.salary);
	}

}

public class GenericClass {

	public static void main(String args[]) {
		//
		//Person p = new Person("Ansar", 10, 10);
		//p.printPerson();
		// We should not fix the type of memeber variable

		// Generic class Object
		// Wrapper class
		// it will not take the primitive type
		//Generic class with paramters passing 
		Person<String, Float, Double> p1 = new 
				Person<String, Float, Double>("Ansar", 10f, 1.0);

		p1.printPerson();
		
		//
		Person<Integer, Integer, Integer> p2 = new 
				Person<Integer, Integer, Integer>(10, 10, 10);
	}
}
