package com.rakhi;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		addofarrayelements(ar,n);
	}
	static void addofarrayelements(int ar[],int n)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum += ar[i];
		}
		System.out.println(sum);
	}

}
