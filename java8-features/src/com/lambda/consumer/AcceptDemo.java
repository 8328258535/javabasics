package com.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AcceptDemo {
	public static void main(String[] args) {
		
		Consumer<Integer> display = a->System.out.println(a);
		
		display.accept(100);
		
		Consumer<List<Integer>>
		displayList = list->list.stream().forEach(a->System.out.println(a));
		
    List<Integer> list = new ArrayList<Integer> ();
		
		list.add(23);
		list.add(43);
		list.add(65);
		
		displayList.accept(list);
	}

}
