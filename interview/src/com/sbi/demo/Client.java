package com.sbi.demo;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		String string;//=> pune=>4  
		Scanner s1=new Scanner(System.in); //taking input from user
		System.out.println("Enter String"); 
		string=s1.next(); 
		int len=string.length();// finding length of string
		System.out.println(len); //4 0-3 printing length
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(string.charAt(i)); 
		}
	}
}
