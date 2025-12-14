package hard;

import dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryRangeGrouping {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", 20, 20000, "IT"),
                new Employee("john", 19, 60000, "IT"),
                new Employee("amar", 50, 70000, "HR"),
                new Employee("rose", 30, 40000, "HR")
        );

        //low - 30000
        //medium - 50000
        //high - more than 50000

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(e -> group(e.getSalary())));

        System.out.println(collect);
    }

    public static String group(int salary){
        if(salary<=30000)
            return "low";
        else if (salary<=50000)
            return "medium";
        else
            return "high";
    }
}
