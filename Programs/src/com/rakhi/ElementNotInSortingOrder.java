package com.rakhi;

import java.util.Scanner;

public class ElementNotInSortingOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		System.out.println(FirstElementNotInSortOrder(ar));
	}
	static int FirstElementNotInSortOrder(int ar [])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				return ar[i+1];
			}		
	}
	return -1;
		
}

}
