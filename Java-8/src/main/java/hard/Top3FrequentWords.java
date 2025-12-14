package hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentWords {

    public static void main(String[] args) {
        String s = "Java is a power full language, java is a object oriented language";
        List<Map.Entry<String, Long>> Top3FrequentWords = Arrays.stream(s.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3).toList();
        System.out.println(Top3FrequentWords);

        List<Map.Entry<String, Long>> list = Arrays.stream(s.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .toList();

        List<Long> topFrequency = list.stream().map(Map.Entry::getValue).distinct().limit(3).toList();

        List<Map.Entry<String, Long>> Top3FrequentDistinctWords = list.stream().filter(e -> topFrequency.contains(e.getValue())).toList();
        System.out.println(Top3FrequentDistinctWords);


    }


}
