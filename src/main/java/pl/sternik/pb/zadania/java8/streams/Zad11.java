package pl.sternik.pb.zadania.java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Zad11 {
   /**
   * Zmodyfikuj zadanie 10, tak aby słowa były posortowane względem długości.
   *
   * @throws IOException 
   */
	public static void main(String[] args) throws IOException {
	    try (BufferedReader reader = 
	            Files.newBufferedReader(Paths.get("wiersz.txt"))) {

	    	List<String> words = reader.lines()
	    			.map(x -> x.toLowerCase())
	    			.distinct()
	    			.sorted((x,y) -> x.length() - y.length())
	    			.collect(Collectors.toList());

	          words.stream().forEach(System.out::println);
	        }
	      }
}
