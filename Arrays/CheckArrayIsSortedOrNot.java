/* Given an array of integers, check whether the array is sorted in non-decreasing order (each element is less than or equal to the next).*/

public class CheckArrayIsSortedOrNot {
    public static boolean isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return  true; 
    }
    public static void main(String[] args) {
        int[] arr = {555555, 55, 555, 5555};
        System.out.println(isSorted(arr));
    }
}
