import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeated {
    public static void main(String[] args) {
        String input = "Programming";

        Character result = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
            ))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .map(entry -> entry.getKey())
            .findFirst()
            .orElse(null);

        System.out.println("First repeated character: " + result);
    }
}
