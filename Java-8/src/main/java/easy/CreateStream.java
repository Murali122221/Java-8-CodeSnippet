package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //list -> stream
        List<String> list= Arrays.asList("murali","rajesh");
        list.stream().forEach(System.out::println);

        //arrays -> stream
        String[] arr={"raj","murali"};
        Arrays.stream(arr).forEach(System.out::println);

        //stream of
        Stream.of("a","b").forEach(System.out::println);

        //stream generate
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

    }
}
