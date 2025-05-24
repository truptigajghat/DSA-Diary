public class SecondLargestInArray {
    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>largest){
                sLargest = largest;
                largest = num;
            }else if(num != largest && num >sLargest){
                sLargest = num;
            }
        }
        if(sLargest == Integer.MIN_VALUE) return -1;

        return sLargest;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 9, 2};
        System.out.println(secondLargest(arr));
    }
}
