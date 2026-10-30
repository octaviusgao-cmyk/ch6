import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me one word: ");
        String x = in.nextLine();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(String str) {
        str.toLowerCase();
        String newStr = "";

        String nonLetters = ",.:;()[]{}!@#$%^&* ";
        for (int j = 0; j < str.length(); j++) {
            String letter = str.substring(j,j+1);
            if (!nonLetters.contains(letter)) {
                newStr += str.charAt(j);
            }
        }
        
        System.out.println(newStr);
        
        for (int i = 0; i < newStr.length() / 2; i++) {
            for (int n = newStr.length(); n > 0; n += -1) {
                if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
