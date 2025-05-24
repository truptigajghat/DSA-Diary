public class PrintSumOfN {
    public static void sumOfN(int n, int sum) {
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumOfN(n-1, sum+n);
    }
    public static int printSum(int n) {
        if(n == 0) return 0;
        return n + printSum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        sumOfN(n, sum);

        System.out.println(printSum(n));
    }
}
