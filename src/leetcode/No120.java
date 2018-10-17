package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No120 {

    public int minimumTotal(List<List<Integer>> triangle) {

        System.out.println(triangle.size());
        Integer integer = triangle.get(4).get(2);
        System.out.println(integer);

        return 0;
    }


    public static void main(String[] args) {

        List l1 =Arrays.asList(new int[]{2});
        List l2 =Arrays.asList(new int[]{3,4});
        List l3 =Arrays.asList(new int[]{6,5,7});
        List l4 =Arrays.asList(new int[]{4,1,8,3});


        ArrayList<List> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        System.out.println(list.get(2).get(1));
//      List<List<Integer>>
//        System.out.println(list.get(4).get(1));


//        int[][] myList = new int[][]{{2},{3,4},{6,5,7},{4,1,8,3}};
//
//        System.out.println(myList[1][1]);




//        No120 no120 = new No120();
//        no120.minimumTotal(list);
    }

}
