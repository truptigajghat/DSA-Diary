/*
     print all subarrays in array
     and total number of subarray
 */

public class SubarraysInArray {
    public static void subarray(int[] arr) {
        int totalSubArray = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays : " + totalSubArray);
    }
    public static void main(String[] args) {
        int [] arr = {55, 7, 9, 4, 25, 2};
        subarray(arr);
    }
}
