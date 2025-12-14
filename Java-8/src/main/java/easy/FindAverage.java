package easy;

import java.util.Arrays;
import java.util.List;

public class FindAverage {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);
    }
}
