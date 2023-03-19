package com.bridgelabz.ifelsestmt;

public class SingleDigitNumber {
	static void printValue(char digit)
	{
	 
	    
	    switch (digit)
	    {
	 
	    case '1':
	        System.out.print("One ");
	        break;
	   
	    }
	}
	 

	static void printWord(String N)
	{
	    int i, length = N.length();
	 
	
	    for (i = 0; i < length; i++)
	    {
	 
	       
	        printValue(N.charAt(i));
	    }
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    String N = "1";
	    printWord(N);
	}
	
}
