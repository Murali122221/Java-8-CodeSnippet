package easy;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> squareNumbers=list.stream().map(n-> n*n).toList();
        System.out.println(squareNumbers);
    }
}
