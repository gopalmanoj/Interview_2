package com.sort.without.method;

public class sort_demo {
public static void getMessage(int num[]) {
	
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			if(num[j]>num[i])
			{
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		System.out.print(num[i]+" ");
	//	System.out.println();
	}
}
	public static void main(String[] args) {
		int num[]= {9,5,7,3,8,2,1,4};
		for(Integer n:num)
		{
			System.out.print(n+" "); 
		}
		System.out.println();
		System.out.println("==========================================================");
		getMessage(num); 
		System.out.println();
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Second Highest\t"+num[1]);  break;
		}

	}

}
