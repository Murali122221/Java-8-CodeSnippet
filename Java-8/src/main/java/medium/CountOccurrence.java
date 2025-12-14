package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOccurrence {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Mango","Apple","Banana","Mango");
        Map<String,Long> countOccurrence=list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countOccurrence);
    }
}
