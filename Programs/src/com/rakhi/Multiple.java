package com.rakhi;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		multiplearrayelements(ar,n);
	}
	static void multiplearrayelements(int ar[],int n)
	{
		int sum=1;
		for(int i=0;i<ar.length;i++)
		{
			sum *= ar[i];
		}
		System.out.println(sum);
	}

	}

