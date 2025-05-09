/*
    Print reverse array
 */

public class reverseArray {
    public static void reverse(int[] arr) {
        int i=0, j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; 
            j--;
        }
        for(int k=0; k<arr.length; k++){
            System.out.print( arr[k] + " " );
        }
    }
    public static void main(String[] args) {
        int[] arr = {45, 36, 18, 9, 4, 27};
        System.out.print("original Array: ");
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("Reverse Array: ");
        reverse(arr);
    }
}
