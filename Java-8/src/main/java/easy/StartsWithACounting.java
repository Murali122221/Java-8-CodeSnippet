package easy;

import java.util.Arrays;
import java.util.List;

public class StartsWithACounting {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Adam", "Mango");
        long startWithACount=list.stream().map(s->s.startsWith("A"))
                .count();
        System.out.println(startWithACount);
    }
}
