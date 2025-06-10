package com.rakhi;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		System.out.println(findmissingnumber(n+1,ar));

	}
	static int findmissingnumber(int n,int ar [])
	{
		int expectedsum=n*(n+1)/2;
		int totalsum=0;
		for(int num:ar)
		{
			totalsum += num;
		}
		return expectedsum-totalsum;
	}

}
