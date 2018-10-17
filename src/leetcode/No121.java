package leetcode;

public class No121 {

    public int maxProfit(int[] prices) {
        if (prices.length <= 0){
            return 0;
        }
        int min = prices[0];
        int max = prices[0];
        int result = max - min;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
                max = min;
                System.out.println("min is " + min);
            }
            if (prices[i] > max ){
                max = prices[i];
                System.out.println("max is " + max);
            }
            if (max - min > result){
                result = max - min;
            }

        }
        System.out.print(min);
        System.out.println(" " + max);
        return (result);


    }

    public static void main(String[] args) {

        int[] stock = {7,1,5,3,6,4};
        int[] stock2 = {2,4,1};
        int result = new No121().maxProfit(stock2);
        System.out.println(result);
    }
}
