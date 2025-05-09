/*
    Print pairs in array 
    and number of total pairs in array
 */

public class PairsInArray {
    public static void ArrayPairs(int[] arr) {
        int totalPairs = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ") " );
            }
            totalPairs++;
            System.out.println();
        }
        System.out.println("total pairs in array : " + totalPairs);
    }
    public static void main(String[] args) {
        int[] arr = {77, 8, 63, 9, 2, 11};
        ArrayPairs(arr);
    }
}
