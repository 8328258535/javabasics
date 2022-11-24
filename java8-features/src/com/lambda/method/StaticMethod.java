package com.lambda.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User{
	
	private String name;
	
	private String age;
	
	public User(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	

	public String getAge() {
		return age;
	}
}

	public  class StaticMethod {
		
		public static int compareByAge(User A,User B) {
			
			return A.getAge().compareTo(B.getAge());
			
		}
		
		public static int compareByName(User A,User B) {
			
			return A.getName().compareTo(B.getName())
;		}
		
	
		public static void main(String[] args) {
			List<User> userList = new ArrayList<> ();
			
			userList.add(new User("ahmed", "27"));
			
			userList.add(new User("taj", "17"));
			
			Collections.sort(userList,StaticMethod::compareByAge);
			
			userList.stream().map(x->x.getName()).forEach(System.out::println);
			
			System.out.println("sort by name :");
			
			Collections.sort(userList,StaticMethod::compareByName);
			
			userList.stream().map(k->k.getName()).forEach(System.out::println);
		
			
			
			
		}
	}
		
	
	


