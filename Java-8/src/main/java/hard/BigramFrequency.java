package hard;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {

    public static void main(String[] args) {

        String paragraph="Java is fun, Java is powerful, Java is good";

        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split(" ");


        Map<String, Long> collect = IntStream.range(0, words.length - 1)
                .mapToObj(i -> words[i] + " " + words[i + 1])
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        System.out.println(collect);
    }

}
