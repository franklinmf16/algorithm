package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class No283 {
    // swap non zero numbers to the front

    public void moveZeroesMethod1(int[] nums) {
        int insertPlace = -1;
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i] == 0 && insertPlace == -1){
                insertPlace = i;
            }

            if (nums[i] != 0 && insertPlace!= -1 && nums[insertPlace] == 0 ){
                nums[insertPlace] = nums[i];
                nums[i] = 0;
                insertPlace += 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums " + i + " is " +nums[i]);
        }


    }

    public void moveZeroesMethod2(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > 0){
                swap(nums, k, i);
                k++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums " + i + " is " +nums[i]);
        }


    }

    public void swap (int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }



    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        int[] nums2 = {1,2,3,4,5,6};
        int[] nums3 = {0,2,1,4,5,6};
        int[] nums4 = {0,0,0,0,0};



//        new No283().moveZeroesMethod1(nums4);
        new No283().moveZeroesMethod2(nums4);

    }

}
