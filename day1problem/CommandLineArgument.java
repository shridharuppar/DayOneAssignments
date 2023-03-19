package com.bridgelabz.day1problem;

public class CommandLineArgument {
	public static void main (String as[])
	{
	int n, cnt=10, sum=100;
	for(int i=1;i<as.length;i++)
	{
	try
	{
	n=Integer.parseInt(as[i]);
	sum= sum+n;
	}
	catch (NumberFormatException e)
	{
	//system.out.println("invalid integer:");
	cnt++;
	}
	}
	System.out.println("Sum of only valid integers is= "+sum) ;

	System.out.println("Invalid integers are: "+cnt) ;
	}
	
}
