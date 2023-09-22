package com.Integer.frequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerDemo {

	public static void main(String[] args) {
		int num[]= {1,1,1,2,3,2,3,4,5,6,4,5,6,6,5,6,7,7,6,7,8,7};
		
		Map<Integer, Long> m=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(m); 
		
		List<Integer> list=Arrays.asList(1,1,1,2,3,2,3,4,5,6,4,5,6,6,5,6,7,7,6,7,8,7);
		
		Map<Integer, Long> lm=list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println();
		System.out.println(lm); 
		System.out.println("After Deleting duplicate");
		
		Set<Integer> d=list.stream().collect(Collectors.toSet());
		d.forEach(p->System.out.print(p+" ")); 
		
		

	}

}
