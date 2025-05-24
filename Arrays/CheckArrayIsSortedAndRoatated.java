/*  Given an array of distinct integers, check if the array is sorted and then rotated. */

public class CheckArrayIsSortedAndRoatated {
    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,1,2,};
        System.out.println(isSortedAndRotated(arr));
    }
}
