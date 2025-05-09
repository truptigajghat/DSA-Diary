/*
   print largest in an array
 */

public class LargestInArray {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 8, 0, -1};
        System.out.println(largest(arr));
    }
}
