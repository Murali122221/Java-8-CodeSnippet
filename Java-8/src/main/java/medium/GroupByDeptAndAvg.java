package medium;

import dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDeptAndAvg {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("bob", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR")
        );

        Map<String,Double> groupByDeptAndAvg=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(groupByDeptAndAvg);
    }
}
