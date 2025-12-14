package easy;

import java.util.Arrays;
import java.util.List;

public class SquareEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> resultList=list.stream().filter(n->n%2==0).map(n->n*n).toList();
        System.out.println(resultList);
    }
}
