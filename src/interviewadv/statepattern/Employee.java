package interviewadv.statepattern;

import java.util.List;

public class Employee {

    public static List<Employee> allEmployees;

    public final String name;
    public final int salary;
    private Role role;

    public Employee(String name, int salary, Role role){
        this.name = name;
        this.salary = salary;
    }


    public void doWork(){
        role.doWork();
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
