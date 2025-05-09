/*
    find maximum sum of subarray using brute force 

 */

public class MaxSubArraySum_Bruteforce{

    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    if(maxSum<sum){
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, -3, 9, -2, 5};
        System.out.println("maximus sum of subarray is : " + maxSubarraySum(arr));
    }
}
