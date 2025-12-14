package easy;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        int sum=list.stream().filter(n->n%2==0)
                .map(n->n*n).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
