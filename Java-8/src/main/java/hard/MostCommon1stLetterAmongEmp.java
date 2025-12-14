package hard;

import dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommon1stLetterAmongEmp {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("amar", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR")
        );

        Optional<Map.Entry<Character, Long>> max = employeeList.stream().map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());

        /*Optional<Map.Entry<Character, Long>> max = collect.entrySet().stream().max(Map.Entry.comparingByValue());*/
        System.out.println(max);
    }
}
