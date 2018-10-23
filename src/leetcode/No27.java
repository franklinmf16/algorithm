package leetcode;

public class No27 {

    public int removeElement(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (k == i) {
                    k++;
                } else {
                    swap(nums, i, k);
                    k++;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }

        return -1;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 5, 3, 4, 6, 3};
        int result = new No27().removeElement(nums, 3);
        System.out.println("result is " + result);
    }
}
