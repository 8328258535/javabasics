package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
	String name;

	String roll;

	public User(String n, String r) {
		name = n;
		roll = r;
	}

	public String getName() {
		return name;
	}

	public String getRoll() {
		return roll;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", roll=" + roll + "]";
	}

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();

		users.add(new User("taj", "junior_dev"));
		users.add(new User("ahmed", "dev"));

		users.add(new User("venky", "dev"));

		users.add(new User("sreenu", "dev"));
		users.add(new User("Nishant", "senior_dev"));
		
		List seniors = process(users,(User u)->u.getRoll().equals("senior_dev"));
		
		System.out.println(seniors);

	}

	
	private static List process(List<User> users, Predicate<User> predicate) {
		
		List<User> result = new ArrayList<> ();
		for (User user : users) 
			if(predicate.test(user))
				result.add(user);
		return result;
			
		}

	}


