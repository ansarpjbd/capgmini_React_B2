package com.capg.day11;
//File IO--File Input and Output
//Reading the File
//Writing in the file

//FileWriter
//It is class 
//Which is used to write the string in file
//import the FileWriter Class
//Create the Object of File Writer Class


import java.io.FileWriter;


public class MyFIle {

	public static void main(String args[])
	{
		
	    try
	    {
		//It is writing in the RAM
		String str="Hello Java";
		
		//Step 1
		//Checked Exception 
		//open A file
		FileWriter fileWriter=new FileWriter("F://abc.txt");
		
		//reading of writing into file
		//fileWriter.write(65);
		char[] c= {'a','b','c'};
		fileWriter.write(c);
		//close the file
		fileWriter.close();
		
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		//Reading and print on the console
		
	}
	
}
