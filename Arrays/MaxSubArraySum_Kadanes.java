/*
     print max sum of subarray using kadanes algorithm
 */

public class MaxSubArraySum_Kadanes {
    public static int MaxSubarraySum(int[] arr) {
        int MaxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<arr.length; i++ ){
            currentSum += arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            MaxSum = Math.max(currentSum, MaxSum);
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, -3, 9, -2, 5};
        System.out.println("maximum sum of subarray is: " + MaxSubarraySum(arr));
    }
}
