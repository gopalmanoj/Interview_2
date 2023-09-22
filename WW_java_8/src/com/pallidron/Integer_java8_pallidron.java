package com.pallidron;

import java.util.stream.IntStream;

public class Integer_java8_pallidron {
	public static boolean Ispallidron(int num)
	{
		String str=Integer.toString(num);
		return IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1)); 
	}

	public static void main(String[] args) {
		boolean check;
		int num=1311;
		check=Ispallidron(num);
		if(check==true)
		{
			System.out.println(num+"\tIs Pallidron");
		}
		else {
			System.out.println(num+"\tIs not Pallidron");
		}
	}

}
