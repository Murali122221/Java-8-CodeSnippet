package medium;

import dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllDepartmentMoreThanEqualTo2Emp {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("bob", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR"),
                new Employee("queen", 30, 40000, "FINANCE")
        );

        List<Map.Entry<String, Long>> list = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).toList();
        System.out.println(list);
    }

}
