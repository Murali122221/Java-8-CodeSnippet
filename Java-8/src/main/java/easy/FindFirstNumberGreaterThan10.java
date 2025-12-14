package easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThan10 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,12,14,11);
        Optional<Integer> findFirstNumberGreaterThan10=list.stream()
                .filter(n->n>10)
                .sorted()
                .findFirst();
        System.out.println(findFirstNumberGreaterThan10.get());
    }
}
