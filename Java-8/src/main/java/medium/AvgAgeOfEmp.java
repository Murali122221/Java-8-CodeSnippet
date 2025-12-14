package medium;

import dto.Employee;

import java.util.Arrays;
import java.util.List;

public class AvgAgeOfEmp {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("bob", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR")
        );

        double v = employeeList.stream().mapToInt(Employee::getAge).average().orElse(0.0);
        System.out.println(v);
    }
}
