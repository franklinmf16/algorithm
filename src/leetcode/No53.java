package leetcode;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.stream.IntStream;

public class No53 {

    public int maxSubArrayE1(int[] nums) {

        IntStream stream = Arrays.stream(nums);
        IntStream intStream = stream.filter(num -> num > 0);
        System.out.println(intStream);

        return intStream.sum();

    }

    public int maxSubArray(int[] nums) {

        int record = nums[0];
        for (int i = 0; i < nums.length; i++) {

            int max = nums[i];
            int secondRecord = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                max += nums[j];
                if (max > secondRecord){
                    secondRecord = max;
                }
            }

            if (secondRecord > record){
                record = secondRecord;
            }

        }
        return record;
    }


    public int resultDP(int[] nums){

        int a = nums[0];
        int result = nums[0];
        int max = nums[0];
        int count = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            max = a + count + nums[i];

            if (nums[i] > max){
                a = nums[i];
                result = a;
                max = a;
                count = 0;
            }else {
                count += nums[i];
            }

            if (max > result){
                result = max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4,8,-1,3,-9};

        No53 no53 = new No53();
        System.out.println(no53.maxSubArrayE1(nums));
        System.out.println(no53.maxSubArray(nums));
        System.out.println(no53.resultDP(nums));

    }

}
