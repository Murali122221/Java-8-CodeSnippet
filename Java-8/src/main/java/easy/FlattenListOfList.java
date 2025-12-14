package easy;

import java.util.Arrays;
import java.util.List;

public class FlattenListOfList {
    public static void main(String[] args) {
        List<List<Integer>> listOfList=Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );
        List<Integer> list= listOfList.stream().flatMap(List::stream)
                .toList();
        System.out.println(list);
    }
}
