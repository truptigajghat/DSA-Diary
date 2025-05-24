public class ReverseArray {
    public static void Reverse(int[] arr, int start,  int end) {
        if(start>=end)  return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        Reverse(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 9, 8};
        int start = 0;
        int end = arr.length-1;
        Reverse(arr, start, end);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
