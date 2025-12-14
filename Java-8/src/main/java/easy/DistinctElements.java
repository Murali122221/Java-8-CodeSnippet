package easy;

import java.util.Arrays;
import java.util.List;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,1,4,6,2,4);
        List<Integer> distinctElements=list.stream().distinct().toList();
        System.out.println(distinctElements);
    }
}
