package pl.sternik.pb.zadania.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad05 {
  /**
   * Utwórz nową listę ze wszystkimi ciągami z oryginalnej listy przekształconymi
   * do małych liter i wydrukuj je.
   */
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale.");

	    List<String> newList = list.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
	    newList.forEach(System.out::println);
  }
}
