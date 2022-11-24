package com.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AndThenDemo {

	public static void main(String[] args) {
		Consumer<List<Integer>> modify = list->{
			for(int i=0;i<list.size();i++) {
				list.set(i,2*list.get(i));
			}
		};
		
Consumer<Integer> display = a->System.out.println(a);
		
		display.accept(100);
		
		Consumer<List<Integer>>
		displayList = list->list.stream().forEach(a->System.out.println(a));
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(43);
		list.add(65);
		
		modify.andThen(displayList).accept(list);

	}

}
