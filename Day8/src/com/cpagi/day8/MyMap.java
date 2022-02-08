package com.cpagi.day8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Map --in map we can store the value as key value 
//key   value
//Id    Name
//1     Ansar
//2     Kkk
//3     Kumar


//Key   Value
//Ansar   1001
//Kumar   1002


//Map does not hold key as duplicate
//Map can have one key as null
//Map can have multiple duplicate Value

public class MyMap {
	
	
	public static void main(String args[])
	{
		
		 //map we have 2 parameters  
		
		//Hashtable
		
		//maintain the order
		/*
		 * Map<Integer,String> map=new TreeMap<Integer,String>();
		 * 
		 * 
		 * //adding value to map // p1,,,,,p2 map.put(1001, "Ansar"); map.put(1002,
		 * "Zack"); map.put(1003, "Anu"); map.put(1004, "Kumar"); map.put(1004,
		 * "Google"); System.out.println(map);
		 */
		
		//Collections.sort
		//map.
	
		
		//print value using key
	  // System.out.println(map.get(1003));
		
		//All the keys with me
		
		  //Set<Integer> keys= map.keySet(); for(Integer key:keys) {
		//  System.out.println("key "+key +" value "+map.get(key)); }
		  
		  
		 // Map<String,Integer> map2=new HashMap<String,Integer>();
		 // map2.put("Ansar",10001); map2.put("Kumar",10001); map2.put("Priya",10001);
		//  map2.put(null, null); map2.put("Priya",10002); map2.put(null, null);
		  
		  //System.out.println(map2);
		  
		  Map<Integer,Employee> map3=new TreeMap<Integer,Employee>(); 
		  map3.put(1000,new Employee(1001,"Ansar",1000f));
		  
		 System.out.println(map3);
		
	}

}
