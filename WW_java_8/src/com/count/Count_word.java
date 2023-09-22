package com.count;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Count_word {
	
	public static boolean IsprimeNo(int num)
	{
		return IntStream.rangeClosed(2, num/2).noneMatch(p->num%p==0);
	}
	
	public static void WordCount(String string)
	{
		String str[]=string.split("\\s");
		Map<String,Integer> m=new LinkedHashMap<String, Integer>();
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);  
			
		if(m.containsKey(str[i]))
		{
			m.put(str[i], m.get(str[i])+1);
		}
		else
		{
			m.put(str[i], 1);
		}
		}
		System.out.println(m); 
	}

	public static void main(String[] args) {
		int num[]= {1,1,2,2,3,34,5,6,6,7,8,1,2,3,49,7};
		Map<Integer, Long> m=Arrays.stream(num).boxed().
				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new
						,Collectors.counting()));
		System.out.println(m); 
		
		System.out.println("_________________________________________");
		
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
	List<Integer> primeNos=	number.stream().filter(Count_word::IsprimeNo).collect(Collectors.toList());
	
	System.out.println(primeNos); 
	
	String str="Welcome to the Bharat Welcome to the Bharat Welcome to the Bharat";
	WordCount(str); 

	}

}
