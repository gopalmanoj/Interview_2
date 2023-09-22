package com.count;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_word {

	public static void main(String[] args) {
		int num[]= {1,1,2,2,3,34,5,6,6,7,8,1,2,3,49,7};
		Map<Integer, Long> m=Arrays.stream(num).boxed().
				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new
						,Collectors.counting()));
		System.out.println(m); 

	}

}
