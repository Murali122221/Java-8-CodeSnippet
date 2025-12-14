package hard;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AvgOfEvery3ElementInSlidingWindow {

    public static void main(String[] args) {
        List<Integer> input= Arrays.asList(1,2,4,6,8);
        int windowSize=3;

        /*List<Double> list = IntStream.range(0, input.size() - 2)
                .mapToObj(i -> (input.get(i) + input.get(i + 1) + input.get(i + 2)) / 3.0)
                .toList();*/

        List<Double> list = IntStream.range(0, input.size() - windowSize + 1)
                .mapToObj(i -> input.subList(i, i+windowSize))
                .map(i -> i.stream().mapToInt(Integer::intValue).average()
                        .orElse(0)).toList();


        System.out.println(list);

    }
}
