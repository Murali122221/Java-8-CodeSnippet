package hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordUsingStream {

    public static void main(String[] args) {
        String s="Java is a object oriented language";
        String collect = Arrays.stream(s.toLowerCase().split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(collect);

        String collect1 = Arrays.stream(s.toLowerCase().split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (rev, ch) -> ch + rev))
                .collect(Collectors.joining(" "));

        System.out.println(collect1);
    }
}
