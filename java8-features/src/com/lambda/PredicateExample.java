package com.lambda;

import java.util.function.Predicate;



public class PredicateExample {
	
	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		
		
		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length()>10;
		}
	};
			
			
			public static void predicate_or() {
		 Predicate<String> containsLetterA = p->p.contains("A");
		 String containsA ="Apple";
		 boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA)	;	
		 System.out.println(outcome);
	}

	public static void main(String[] args) {
		
		
		
		
		Predicate<Integer> isAdult = i-> (i>18);
		
		Predicate<Integer> notAdult = i->(i<18);
		Predicate<Integer> isRiterid = i->(i>60);
//		
//		boolean results = isAdult. 
//		System.out.println(isAdult.test(23));
//		
		predicate_or();

	}

}
