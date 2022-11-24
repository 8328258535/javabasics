package com.lambda;

interface PrintDesignation {
	public String publish(String designation );
}

public class WithParamer {
	public static void main(String[] args) {
		PrintDesignation d1 = (designation)->{
			return "your designation is"+designation;
		};
		System.out.println(d1.publish("java developer"));
	}

}
