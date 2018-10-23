package interviewadv.statepattern;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1000, new Engineer());
        Employee employee2 = new Employee("Mary", 20000, new Engineer());

        System.out.println("Testing manager");
        employee2.setRole(new Manager(Arrays.asList(employee1)));



    }

}
