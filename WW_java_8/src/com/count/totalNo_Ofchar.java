package com.count;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class totalNo_Ofchar {

	public static void main(String[] args) {
	String string="welcomewelcomewelcomewelcomewelcomewelcomewelcomewelcome";
	
	Map<Character, Long> m=string.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	System.out.println(m);
	Long count=m.entrySet().stream().map(p->p.getValue()).collect(Collectors.summingLong(p->p));
	System.out.println("Total Characters\t"+count); 
	
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	
	list.stream().map(p->p).collect(Collectors.summarizingInt(p->p));
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println(list.stream().collect(Collectors.summarizingInt(p->p.sum(3,6))));  
	
	int sum=list.stream().mapToInt(p->p).sum();
	
	System.out.println("Sum is\t"+sum);
	
	int sum1=list.stream().reduce(0,(a,b)->a+b);
	System.out.println("Sum1 is\t"+sum1); 

	}

}
