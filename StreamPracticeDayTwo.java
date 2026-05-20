
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPracticeDayTwo {

    public static void main(String[] args) {

        List<String> names
                = Arrays.asList("Ali", "Ahmed", "Ali", "Malik", "Ahmed", "Ali");
        List<Integer> numbers = Arrays.asList(10, 45, 22);

        List<String> words
                = Arrays.asList("java", "spring", "java", "boot", "spring", "java");

        //Example 1 Grouping counting
        Map<String, Long> result
                = names.stream()
                        .collect(Collectors.groupingBy(
                                name -> name,
                                Collectors.counting()
                        ));

        System.out.println(result);

        //Example 2 Find Max Number Safely 
        Optional<Integer> max
                = numbers.stream().max(Integer::compareTo);

        max.ifPresent(System.out::println);

        //Excample 3
        Map<String, Long> result1
                = words.stream()
                        .collect(Collectors.groupingBy(
                                word -> word,
                                Collectors.counting()
                        ));

        System.out.println(result1);

    }
}
