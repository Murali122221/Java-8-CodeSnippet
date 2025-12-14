package medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharInString {

    public static void main(String[] args) {
        String input="apple";
        Map.Entry<Character, Long> nonRepeatChar = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() == 1)
                .findFirst().orElseThrow();

        System.out.println(nonRepeatChar);


    }
}
