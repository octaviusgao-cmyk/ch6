import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
	int n = 67;
	toBinary(n);
	}
}

public static String toBinary(int n) {
    String bin = "";
    while (n != 0) {
        int remainder = n % 2;
        n = n / 2;
        bin = remainder + bin;
    }
    return bin;
}
