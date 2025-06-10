package com.rakhi;
/*
 * It is a DSA Method Problem and very Time complixity 
 */
import java.util.*;
public class SecondSmalllest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		secondsmall(ar,n);
	}
	static void secondsmall(int ar [],int n)
	{
		int max1,max2;
		if(ar[0]<ar[1])
		{
			max1=ar[1];
			max2=ar[0];
		}
		else {
			max1=ar[0];
			max2=ar[1];
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<max1)
			{
				max2=max1;
				max1=ar[i];
			}
			else if(ar[i]<max2)
			{
				max2=ar[i];
			}
		}
		System.out.println(max2);
	//	System.out.println(max1);--> First Smallest
	}

}
