package leetcode;

public class BinarySearch {

    public int binarySearch(int[] input, int target){

        int length = input.length;
        int start = 0;
        int end = length;
        int count = 0;

        while (start <= end){
            count ++;
            System.out.println("count is " + count);
            int mid = (start + end)/2;
            if (target == input[mid]){
                return mid;
            }
            if (target < input[mid]){
                end = mid - 1;
            }
            if (target > input[mid]){
                start = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] nums= {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {1,2,3};

        int output = new BinarySearch().binarySearch(nums, 9);
        System.out.println(output);


    }

}
