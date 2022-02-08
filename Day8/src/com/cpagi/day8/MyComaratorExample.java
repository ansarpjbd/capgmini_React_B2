package com.cpagi.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//Set sorting
//Take the tree set as implemented class
//Create a comparator 
//pass the comparator to constructor of tree set 

//you can use comparable wit object

public class MyComaratorExample {

	
	public static void main(String args[])
	{
		/*
		 * List<Employee> ls=new ArrayList<Employee>(); ls.add(new Employee(10, "Ansar",
		 * 101.0f)); ls.add(new Employee(1, "Priya", 50.0f)); ls.add(new Employee(2,
		 * "Kumar", 10.0f)); ls.add(new Employee(100, "Anil", 5.0f)); ls.add(new
		 * Employee(5, "Zee", 60.0f));
		 * 
		 * // using the comparator //pass comparator as second parameters //if you are
		 * passing the comparator //you cannot pass third parameters as
		 * Collections.sort(ls,new EmployeeSortByID());
		 * 
		 * ls.forEach(System.out::println);
		 */
		Set<Employee> employeeList=new TreeSet<Employee>();
		employeeList.add(new Employee(10, "Ansar", 101.0f));
		employeeList.add(new Employee(1, "Priya", 50.0f));
		employeeList.add(new Employee(2, "Kumar", 10.0f));
		employeeList.add(new Employee(100, "Anil", 5.0f));
		employeeList.add(new Employee(5, "Zee", 60.0f));
		System.out.println("Before sort");
		employeeList.forEach(System.out::println);
		System.out.println("After sort");
		//do not use the Sort method
		//Collections.sort(employeeList);
	}
}
