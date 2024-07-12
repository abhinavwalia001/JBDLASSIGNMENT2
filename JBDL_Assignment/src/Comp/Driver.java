package Comp;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person(1, "Abhinav", 150000 ,25));
		people.add(new Person(3, "Sham  ",  500000  ,25));
		people.add(new Person(1, "Pulkit",  40000   ,25));
		people.add(new Person(1, "Abhinav", 90000   ,26));
		
		
		System.out.println("List of the Person is ");
		for(Person person :people) {
			System.out.println(person);
		}
		Collections.sort(people);
		
		System.out.println("\n the sorted List of the Person is ");
		
		for(Person person :people) {
			System.out.println(person);
		}
		
	}

}
