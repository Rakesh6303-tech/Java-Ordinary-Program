package com.string.programs;
import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		System.out.println(CheckPalindrome(s));
	}
	static String  CheckPalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else {
				return "Not Palindrome String";
			}
		}
		return "Palindrome String";
	}

}
