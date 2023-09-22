package com.Armstrong;

public class Integer_Armstrong {

	public static void main(String[] args) {
		int num=153,sum=0,temp,r;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		System.out.println(sum); 

	}

}
