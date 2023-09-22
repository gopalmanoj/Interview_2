package com.Integer.frequency;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_frequency {

	public static void main(String[] args) {
	String string="shreekrishnagovindharemurarihenathnarayanvashudev";
	
	Map<Character, Long> f=string.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
	
	System.out.println(f); 
	
	Long count=f.entrySet().stream().map(p->p.getValue()).collect(Collectors.summingLong(p->p)); 
	System.out.println("Total No Of character in the string are\t"+count); 

	Stream<Integer> s=Stream.of(1,1,1,1,1,2,2,3,3,4,4,5,5,6);
	
	Set<Integer> l=s.filter(p->p%2==0).collect(Collectors.toSet());
	System.out.println(l); 
	}

}
