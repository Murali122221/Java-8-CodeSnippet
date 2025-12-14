package easy;

import jdk.dynalink.linker.LinkerServices;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,7,8,32,3,2);
        long counts=list.stream().filter(n->n>5).count();
        System.out.println(counts);
    }
}
