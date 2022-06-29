package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class person {

	/*
	 Create Person class that contains first name, last name, and ID. Create a
	 getCommonLastNames() method with that takes List as a parameter. The method
	 should return a Map<String, List> whereby the key is the common last name and
	 the value is the list of people that share the same last name.
	 */
	String firstName, lastName;
	int ID;
	
	person(String firstName, String lastName, int ID){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person person1 = new person("Nandeep", "Raj", 1);
		person person2 = new person("Nandeep", "Raj", 1);
		person person3 = new person("Nandeep", "Raj", 1);
		person person4 = new person("Nandeep", "Raj", 1);

		List<Object> per= new ArrayList<Object>();
		per.add(person1);
		per.add(person2);
		per.add(person3);
		per.add(person4);
		
		int  A[] = {1, 2, 3};
		Arrays.sort(A);
		
		getCommonLastNames(per);
		
	}

	public static Map<String, List<person>> getCommonLastNames(List person){
		//Map<String, List<person>> common= new Map<String, List<person>>();
		 
		for(int i=0; i<person.size(); i++) {
			
		}
		
		return null;
	}
}
