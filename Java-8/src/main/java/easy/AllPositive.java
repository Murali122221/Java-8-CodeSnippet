package easy;

import java.util.Arrays;
import java.util.List;

public class AllPositive {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,6,6);
        boolean allPositive=list.stream().allMatch(n->n>0);
        System.out.println(allPositive);
    }
}
