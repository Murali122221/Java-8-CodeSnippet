package medium;

import dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentWithHighestAvgSalary {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("bob", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR"),
                new Employee("queen", 30, 40000, "FINANCE")
        );

        Optional<Map.Entry<String, Double>> max = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(max);
    }
}
