package com.pallidron;

public class Integer_pallidron {

	public static void main(String[] args) {
		int num=131,temp,sum=0,r;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+(r);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+"\tIs pallidron"); 
		}
		else
		{
			System.out.println(temp+"\tIs not pallidron"); 
		}
		 
		

	}

}
