package easy;

import java.util.Arrays;
import java.util.List;

public class SumAndProductOfStream {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        int sum=list.stream().reduce(0,(a,b)->a+b);
        int product=list.stream().reduce(1,(a,b)->a*b);
        System.out.println(sum);
        System.out.println(product);
    }
}
