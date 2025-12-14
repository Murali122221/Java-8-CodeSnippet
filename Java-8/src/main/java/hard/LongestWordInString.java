package hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestWordInString {

    public static void main(String[] args) {
        String s="Hi I am Muralitharan!";
        String s1 = Arrays.stream(s.toLowerCase()
                        .replaceAll("[^a-z\\s]", "").split(" "))
                .max(Comparator.comparing(String::length)).orElse("");

        System.out.println(s1);
    }
}
