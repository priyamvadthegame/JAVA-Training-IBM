package com.Stream;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
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
		TestData.getAllNews().stream().collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
		System.out.println("\n**Assignment5 answer\n");
		System.out.println(TestData.getAllNews().stream().filter((News n)->n.getComment().contains("budget")).count());
		System.out.println("\n**Assignment6 answer\n");
		TestData.getAllNews().stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting())).forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println("\n**Assignment7 answer\n");
		TestData.getAllTransactions().stream().filter((Transaction t)->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
		System.out.println("\n**Assignment8 answer\n");
		TestData.getAllTransactions().stream().map((Transaction t)->t.getTrader().getCity()).distinct().forEach(System.out::println);
		System.out.println("\n**Assignment9 answer\n");
		Function<Transaction, String> f=(Transaction t)->t.getTrader().getName();
		TestData.getAllTransactions().stream().filter((Transaction t)->t.getTrader().getCity().equalsIgnoreCase("Pune")).sorted(Comparator.comparing(f)).forEach(System.out::println);
		System.out.println("\n**Assignment10 answer\n");
		System.out.println(TestData.getAllTransactions().stream().sorted(Comparator.comparing(f)).map((Transaction t)->t.getTrader().getName()).collect(joining(",")));
		System.out.println("\n**Assignment11 answer\n");
		Optional<Transaction> opTransaction = TestData.getAllTransactions().stream() .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Pune")) .findAny();
		if(opTransaction.isPresent())
		{	
			System.out.println(opTransaction.get().getTrader().getName());
		}
		else
		{
			System.out.println("No traders from specified city");
		}
		
		System.out.println("\n**Assignment12 answer\n");
		TestData.getAllTransactions().stream().filter((Transaction t)->t.getTrader().getCity().equalsIgnoreCase("Pune")).map((Transaction t)->t.getValue()).forEach(System.out::println);
		System.out.println("\n**Assignment13 answer\n");
		Optional<Integer> maxNumber =TestData.getAllTransactions().stream().map((Transaction t)->t.getValue()).reduce(Integer::max);
		System.out.println(maxNumber.get());
		System.out.println("\n**Assignment14 answer\n");
		Optional<Integer> minNumber =TestData.getAllTransactions().stream().map((Transaction t)->t.getValue()).reduce(Integer::min);
		System.out.println(minNumber.get());
		System.out.println("\n**Assignment15 answer\n");
		
		
		
	}

}
