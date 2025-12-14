package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLists {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        List<Integer> ascending=list.stream().sorted().toList();
        System.out.println("Ascending Order: "+ascending);

        List<Integer> descending=list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending Order: "+descending);
    }
}
