import java.util.Scanner;

public class s {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a word: ");
		String word = Scanner.nextString();
	}
	
	public static boolean isAbecedarian(String str) {
		if (str.length() <= 1) {
			return true;
			}
		for (int i = 0; i <= str.length(); i++) {
			if (str.charAt(i) < str.charAt(i - 1)) {
				return false;
				}
			} 
			return true;
		}
}
