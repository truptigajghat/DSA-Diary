/*
   print Smallest in an array
   
*/

public class SmallestInArray {
    public static int smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {55, 87, 9, 6, -7, -1, 0};
        System.out.println(smallest(arr));
    }
}
