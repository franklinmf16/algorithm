package combinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinitions {
    public void combinations(List<Integer> selected, List<Integer> data, int n) {

        //initial value for recursion


        //how to select elements
        //how to output

        if (n == 0) {
            for (Integer i : selected) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }

        if (data.isEmpty()) {
            return;
        }

        // select element 0
        selected.add(data.get(0));
        combinations(selected, data.subList(1, data.size()), n - 1);

        // un-select element 0
        selected.remove(selected.size() - 1);
        combinations(selected, data.subList(1, data.size()), n);

    }

    public static void main(String[] args) {
        Combinitions comb = new Combinitions();
        comb.combinations(new ArrayList<>(),Arrays.asList(1, 2, 3), 2);
    }

}
