public class Doubloon {
    public static void main(String[] args) {
		System.out.println(doobloon("aabbccdd"));
		}
		
	public static boolean doobloon (String s) {
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (count(s, letter) != 2) {
				return false;
				}
			
			}
			return true;
		}
	public static int count (String s, char x) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == x) {
				sum++;
				}
			}
		return sum;
		}
}
