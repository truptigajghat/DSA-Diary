import java.util.Scanner;

public class CheckStringPalindrome {
    public static boolean isPalindrome(String str, int start, int end) {
        if(start>=end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String str = sc.next();
        boolean result = isPalindrome(str, 0, str.length()-1);
        System.out.println(result);
        sc.close();
    }
}
