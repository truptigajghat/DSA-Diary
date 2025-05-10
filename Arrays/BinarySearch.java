public class BinarySearch {
    public static int binary(int[] arr, int target) {
        int i=0; int j=arr.length-1;
        while (i<=j) {
            int mid =( i+ j)/2;
            if(arr[mid] == target){
                return mid;
            }else if (arr[mid]< target) {
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {66, 70, 90, 105, 150, 200};
        int target = 105;
        System.out.println(binary(arr, target));
    }
}
