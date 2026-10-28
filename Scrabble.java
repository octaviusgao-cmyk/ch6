import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me two words: ");
		String x = in.nextLine();
		String y = in.nextLine();
		System.out.println(canSpell(x, y));
		}
    public static boolean canSpell(String s, String x) {
        for (int i = 0; i < x.length(); i++) {
            char letter = x.charAt(i);
            if (count(s, letter) < count(x, letter)) {
				return false;
				}
                }
              return true;
            }
            
    public static int count(String s, char c) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == c) {
				sum++;
				}
			}
		return sum;
		}
        }

    
    
    

