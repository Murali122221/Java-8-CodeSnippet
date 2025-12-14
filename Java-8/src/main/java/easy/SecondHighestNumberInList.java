package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumberInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> secondHighestNumberInList=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighestNumberInList.get());
    }
}
