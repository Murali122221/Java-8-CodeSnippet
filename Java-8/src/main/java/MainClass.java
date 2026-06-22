public class MainClass{
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "John", "IT", "Chennai", 85),
                new Student(2, "David", "IT", "Bangalore", 92),
                new Student(3, "Mary", "HR", "Chennai", 78),
                new Student(4, "John", "IT", "Chennai", 88),
                new Student(5, "Steve", "Finance", "Mumbai", 95),
                new Student(6, "Mary", "HR", "Bangalore", 82)
        );

        //1. Group by department
        Map<String,List<Student>> grpByDept=students.stream().collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println(grpByDept);

        //2. Count by department
        Map<String,Long>studentsCountPerDept=students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
        System.out.println(studentsCountPerDept);

        //3. Sum marks by department
        Map<String,Integer> sumMarkByDept=students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.summingInt(Student::getMarks)));
        System.out.println(sumMarkByDept);

        //4. Names by department
        Map<String,List<String>> namesByDept=students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(namesByDept);

        //5. Unique names by department
        Map<String,Set<String>> uniqueNameByDept= students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.mapping(Student::getName,Collectors.toSet())));
        System.out.println(uniqueNameByDept);

        //6. Joining names
        Map<String,String> joiningName=students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.mapping(Student::getName,Collectors.joining(","))));
        System.out.println(joiningName);

        //7. Average marks
        Map<String,Double> avgMarks=students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getMarks)));
        System.out.println(avgMarks);

        //8. Max marks student
        Map<String,Optional<Student>> maxMarks= students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.maxBy(Comparator.comparingInt(Student::getMarks))));
        System.out.println(maxMarks);

        //9. Multi-level grouping
        Map<String,Map<String,List<String>>> multiLevelpGrp=students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.groupingBy(Student::getCity,Collectors.mapping(Student::getName,Collectors.toList()))));
        System.out.println(multiLevelpGrp);

        //10. Duplicate detection
        List<String> dup = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting())).
                entrySet().stream().filter(Entry<String,Long> e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(dup);

    }
}
