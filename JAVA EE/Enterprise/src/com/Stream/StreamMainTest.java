package com.Stream;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;



public class StreamMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n**Assignment1 answer\n");
		
		TestData.getAllFruits().stream().filter((Fruit f)->f.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).forEach(System.out::println);
		System.out.println("\n**Assignment2 answer\n");
		TestData.getAllFruits().stream().collect(Collectors.groupingBy(Fruit::getColor)).forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println("\n**Assignment3 answer\n");
		TestData.getAllFruits().stream().filter((Fruit f)->f.getColor().equals("Red")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);
		System.out.println("\n**Assignment4 answer\n");
		TestData.getAllNews().stream();
		System.out.println("\n**Assignment5 answer\n");
		System.out.println(TestData.getAllNews().stream().filter((News n)->n.getComment().contains("budget")).count());
		System.out.println("\n**Assignment6 answer\n");
		
	}

}
