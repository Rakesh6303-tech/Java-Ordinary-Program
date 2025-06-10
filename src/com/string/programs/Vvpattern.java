package com.string.programs;
import java.util.*;
public class Vvpattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				if( j==i || j==(2*n-2-i))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
