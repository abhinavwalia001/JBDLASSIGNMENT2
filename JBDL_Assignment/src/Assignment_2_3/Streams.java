package Assignment_2_3;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		
		//1) remove Duplicates
		//2) remove odd
		//3) square of the list
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2,3,2,2,4,7,9,11,44,23,12,12,34));
		
		List<Integer> result = list.stream()
									.distinct()
									.filter(n-> n%2==0)
									.map(n->n*n)
									.collect(Collectors.toList());
		System.out.println("the Output for the Desired List is :" + result);
		
		
	}

}
