package interviewadv.statepattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager implements Role {

    private final List<Employee> reporters;

    public Manager(List<Employee> reporters) {
        this.reporters = Collections.unmodifiableList(new ArrayList<>(reporters));
    }

    private Employee selectReporter(){
        return null;
    }


    @Override
    public void doWork() {

    }

    @Override
    public String toString() {
        return "manager";
    }
}
