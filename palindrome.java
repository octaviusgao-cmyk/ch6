import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me one word: ");
        String x = in.nextLine();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            for (int n = str.length(); n > 0; n += -1) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
