package hard;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {

    public static void main(String[] args) {

        List<Character> characterList= Arrays.asList(
                'A','a','@','#','1','N'
        );

        Map<String, List<Character>> collect = characterList.stream().collect(
                Collectors.groupingBy(e -> groupChars(e))
        );

        System.out.println(collect);
    }

    public static String groupChars(Character c){
        if(Character.isUpperCase(c)) return "uppercase";
        else if (Character.isLowerCase(c)) return "lowercase";
        else if(Character.isDigit(c)) return "digit";
        else return "others";
    }
}
