package leetcode;

import java.util.HashMap;

public class No343 {

    public int breakInteger(int n, HashMap<Integer, Integer> store) {

        if (n==1){
            return 1;
        }

        if (store.get(n) != null){
            return store.get(n);
        }

        int max = -1;
        for (int i = 1; i <= n-1; i++) {
            int compare = Math.max((i * (n - i)), ((i) * breakInteger((n - i), store)));
            if (compare > max) {
                max = compare;
            }

        }
        store.put(n,max);
        System.out.println("for n = " + n + " max is " + max);
        return max;

    }

    public int integerBreak(int n){
        HashMap<Integer, Integer> store = new HashMap<>();
        return breakInteger(n, store);

    }

    public static void main(String[] args) {
        int input = 15;
        int result = new No343().integerBreak(input);
        System.out.println(result);
    }
}
