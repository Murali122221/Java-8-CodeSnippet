package medium;

import dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmpBasedOnSalary {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("bob", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR")
        );
        List<Employee> list = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(list);
    }
}
