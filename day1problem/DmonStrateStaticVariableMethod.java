package com.bridgelabz.day1problem;

public class DmonStrateStaticVariableMethod {
	 static int x = 100;
	   static int y;
	   static void func(int z) {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static {
	      System.out.println("Running static initialization block.");
	      y = x + 50;
	   }
	   public static void main(String args[]) {
	      func(80);
	   }
	}

