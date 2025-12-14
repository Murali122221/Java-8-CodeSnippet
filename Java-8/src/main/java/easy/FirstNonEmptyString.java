package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("","","hello","world");
        Optional<String> firstNonEmptyString=list.stream().filter(s->!s.isEmpty()).findFirst();
        System.out.println(firstNonEmptyString.get());
    }
}
