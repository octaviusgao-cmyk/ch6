import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me two words: ");
		String x = in.nextLine();
		String y = in.nextLine();
		System.out.println(ppap(x, y));
	}
	public static String ppap(String x, String y) {
		String lowercase = y.substring(0, 1);
		String answer = "I have a " + x + ", I have a " + y;
		String answer2 = ", Uh! " + lowercase.toUpperCase() + y.substring(1) + " " + x;
		return answer + answer2;
		}
}

	
