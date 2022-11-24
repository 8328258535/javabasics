package com.lambda;


interface Myname{
	public  void print(); 
		
		
	}


public class WithLambada {
public static void main(String[] args) {
	
	String name="ahmed";
	Myname n = ()->{
		
		System.out.println(name);
		
	};
	n.print();
	
	
}
}
