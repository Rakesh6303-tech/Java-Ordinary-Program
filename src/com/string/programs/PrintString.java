package com.string.programs;
import java.util.*;
public class PrintString {

	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		PrintStringcharbychar(s);
	}
	static void PrintStringcharbychar(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
