import java.util.Scanner;

public class PrintProductOfN {
    public static int product(int n) {
        if(n == 1) return 1;
        return n * product(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the num : ");
        int n = sc.nextInt();
        System.out.println(product(n));
        sc.close();
    }
}
