package easy;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5,6);
        boolean numberDivisibleBy3=list.stream().anyMatch(n->n%3==0);
        System.out.println(numberDivisibleBy3);
    }
}
