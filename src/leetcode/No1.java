package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class No1 {

    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        while (i < nums.length) {
            int a = nums[i];
            for (int k = 0; k < i; k++) {
                int sum = a + nums[k];
                if (sum == target){
                    return new int[]{k, i};
                }
            }
            i ++;
        }

        return null;
    }

    public int[] twoSumS2(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i,nums[i]);
        }
        for (int i = 0; i < nums.length ; i++) {
            int complement = target - nums[i];
            if (map.containsValue(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }
        return null;

    }


    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};

        int sum = nums[0] + nums[1];

        System.out.println(sum);

        No1 twoSum = new No1();
        int[] results = twoSum.twoSum(nums, 9);
        int i = results[0] + results[1];
        System.out.println(i);


    }

}
