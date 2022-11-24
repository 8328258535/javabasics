package com.assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<Course> course = new ArrayList<>();
		course.add(new Course("Neet", 2351, "Grishma", "6 Months", 100000));
		course.add(new Course("JEE", 2353, "Arun", "4 Months", 80000));
		course.add(new Course("CAT", 2352, "Ravish", "5 Months", 60000));
		course.add(new Course("FMGE", 2354, "Joyson", "7 Months", 500000));
		course.add(new Course("EAMCET", 2356, "Ahmed", "3 Months", 55000));
		course.add(new Course("HotelManagment", 2355, "khan", "9 Months", 65000));
		course.add(new Course("Software", 2357, "Nishant", "2 Months", 36000));

		// course.stream

		course.stream().sorted(Comparator.comparing(Course::getCourse_fee)).forEach(System.out::println);

		// System.out.println(myCourse);

//		Collections.sort(myCourse, new Comparator<Course>() {
//
//			@Override
//		public int compare(Course c1, Course c2) {
//
//			return c1.getCourse_fee().compareTo(c2.getCourse_fee());			}
//		});

//		
//		}

	}

}
