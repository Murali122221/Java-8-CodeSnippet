package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Mango","cat","goat","rat");
        Map<Integer,List<String>> groupByLength= list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);
    }
}
