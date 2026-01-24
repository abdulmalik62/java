
import java.util.*;
import java.util.stream.*;

public class StreamPractice {

    public static void main(String[] args) {

        // Example:1 Find Odd Numbers
        Arrays.asList(10, 15, 20, 25, 30).stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
        // Example 2 Make all strings in to uppercase
        List<String> upper
                = Arrays.asList("malik", "ali", "ahmed")
                        .stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println(upper);
        // Example 3 Count Even Numbers
        long count
                = Arrays.asList(2, 5, 8, 11, 14, 17)
                        .stream()
                        .filter(n -> n % 2 == 0)
                        .count();
        System.out.println(count);
        // Example 4 Sort Array in Ascending
        Arrays.asList(40, 10, 30, 20)
                .stream()
                .sorted()
                .forEach(System.out::println);
        // Example 5 Remove Duplicates
        List<String> unique
                = Arrays.asList("Ali", "Ahmed", "Ali", "Malik", "Ahmed")
                        .stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(unique);
        System.out.println("----------------------------------------------");

        // Excersice 1 Find Numbers greater than 
        System.out.println("Ex:1");
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3, 15);

        numbers.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        // Excersice 2 List strings to lowercase
        System.err.println("Ex: 2");

        List<String> names = Arrays.asList("ALI", "AHMED", "MALIK");
        List<String> lowenames = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.err.println(lowenames);

        System.out.println("----------------------------------------------");

        //Excersice 3 count names starts with letter "A"
        System.err.println("Ex: 3");
        List<String> names1 = Arrays.asList("Ali", "Ahmed", "Malik", "Ayaan");

        long count1 = names1.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.err.println(count1);

        System.out.println("----------------------------------------------");

        //Excersice 4 Sort Names Alphabetically
        System.out.println("Ex : 4");
        names1.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        //Excersice 5 print even numbers
        System.out.println("Ex : 5");
        List<Integer> numbers1 = Arrays.asList(4, 7, 10, 13, 16);

        numbers1.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        //Excersice 6 Given a list of integers, remove duplicates and collect into a list.
        System.out.println("Ex : 6");

        List<Integer> numbers2 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> distinctnumbers = numbers2.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctnumbers);

        System.out.println("----------------------------------------------");

        //Excersice 7 Sum of all even numbers
        System.out.println("Ex: 7");
        List<Integer> sumnumbers = Arrays.asList(2, 5, 8, 11, 14, 17);

        long sum = sumnumbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println(sum);

        System.out.println("----------------------------------------------");

    }
}
