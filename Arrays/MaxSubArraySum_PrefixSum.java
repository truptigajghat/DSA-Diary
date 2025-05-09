/*
    print maximum sum of subarray using prefix sum
    
 */

public class MaxSubArraySum_PrefixSum {

    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum<sum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr =  {4, 8, -3, 9, -2, 5};
        System.out.println("max sum of subarray : " + maxSubarraySum(arr));
    }
}
