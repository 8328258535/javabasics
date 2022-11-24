package com.lambda;

interface Operation {
	public int isOdd(int n);

}

interface Operation2 {
	public int isPrime(int n1);
}

public class Task {

	public static void main(String[] args) {

		Operation o1 = n -> {
			if (n % 2 == 0)
				System.out.println("true");
		
			else
			
				System.out.println("false");
			return n;
		};

		Operation2 o2 = n1 -> {
			for (int i = 1; i <= n1 / 2; i++) {
				if (n1 / i == 0)
					System.out.println("true");
					
				else
					System.out.println("false");
			}
			return n1;
		};
		
		o1.isOdd(24);
		o2.isPrime(23);

	}

}
