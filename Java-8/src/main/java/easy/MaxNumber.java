package easy;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        int max=list.stream().reduce(0,(a,b)->Integer.max(a,b));
        System.out.println(max);

    }
}
