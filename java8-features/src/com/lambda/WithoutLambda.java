package com.lambda;

interface Name{
	public void print();
}

public class WithoutLambda{
	String s = "tajdar";
	
	public static void main(String[] args) {
		
		WithoutLambda name = new WithoutLambda () ;
		name.print();
	}
		
	public void print() {
		
		System.out.println(s);
	}
	}

	
		