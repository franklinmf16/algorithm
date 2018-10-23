package leetcode;

import java.util.HashMap;

public class No70 {

    public int solution(int n) {

        HashMap<Integer, Integer> memo = new HashMap<>();


        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (memo.get(n) == null) {
            memo.put(n, solution(n - 1) + solution(n - 2));
        }

        return memo.get(n);

    }

    public int solutionTwo(int n) {

        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);

        for (int i = 3; i <= n; i++) {
            memo.put(i, memo.get(i - 1) + memo.get(i - 2));
        }

        return memo.get(n);
    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }


    public static void main(String[] args) {

        No70 no70 = new No70();
        System.out.println(no70.solution(6));
        System.out.println(no70.solutionTwo(6));
        System.out.println(no70.climbStairs(6));

    }

}
