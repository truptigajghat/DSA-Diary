public class ContainsDuplicate {
    public static boolean isDuplicate(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 99, 6, 2, 1};
        System.out.println(isDuplicate(arr));
    }
}
