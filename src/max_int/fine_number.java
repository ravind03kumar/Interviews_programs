package max_int;

import modal.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class fine_number {
    public static void main(String[] args)
    {
        Employee p1 = new Employee("Akash", 115000);
        Employee p2 = new Employee("khushboo", 100000);
        Employee p3 = new Employee("shayana", 120000);

        List<Employee> salaries = Arrays.asList(p1, p2, p3);

        // get a person with the minimum income
        Employee min = salaries.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                .get();
        System.out.println("Employee with minimum Salary " + min);

        // get a person with the maximum income
        Employee max = salaries.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))).get();
        System.out.println("Employee with maximum Salary " + max);
    }
}
