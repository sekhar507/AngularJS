package org.iowa;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {

		Map<Integer, String> Category = new HashMap<>();
		Category.put(1, "Grocery");
		Category.put(2, "Clothes");
		Category.put(3, "medicine");
		Category.put(4, "soda");

		String result = "";
		for (Map.Entry<Integer, String> entry : Category.entrySet()) {
			/*
			 * if ("Clothes".equals(entry.getValue())) { result =
			 * entry.getValue(); }
			 */
			
			if(Category.containsValue(entry.getValue()))
			{
				System.out.println(entry.getValue());
			}
		}
		


		System.out.println(result);
	}
}
