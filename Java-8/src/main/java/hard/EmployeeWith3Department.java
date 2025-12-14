package hard;

import dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeWith3Department {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("alice", 20, 20000, "HR"),
                new Employee("amar", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR"),
                new Employee("alice", 20, 20000, "Finance")
        );

        List<String> list = employeeList.stream().collect(Collectors.groupingBy(Employee::getName))
                .entrySet().stream().filter(e -> e.getValue().size() >= 3)
                .map(Map.Entry::getKey).toList();

        System.out.println(list);
    }
}
