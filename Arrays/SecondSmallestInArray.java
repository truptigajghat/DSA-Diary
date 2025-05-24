public class SecondSmallestInArray {
    public static int secondSmallest(int[] arr) {
        if(arr.length < 2) return -1;

        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < smallest){
                sSmallest = smallest;
                smallest = num;
            }else if(num != smallest && num < sSmallest){
                sSmallest = num;
            }
        }
        return (sSmallest == Integer.MAX_VALUE) ? -1 : sSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 5, 1};
        System.out.println(secondSmallest(arr));
    }
}
