package medium;

import dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmpInEachDepartment {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("bob", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR"),
                new Employee("queen", 30, 40000, "FINANCE")
        );

        Map<String,Optional<Employee>> highestPaidEmp=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highestPaidEmp);

    }
}
