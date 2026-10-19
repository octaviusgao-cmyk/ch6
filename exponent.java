import java.util.Scanner;

public class Gauss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me two numbers: ");
		for (;;) {
			double x = in.nextDouble();
			int n = in.nextInt();
			if (n<= 0) {
				System.out.println("Input something else");
				} else {
					System.out.println(gauss(x, n));
					}
			}
		}
		public static double gauss (double x, double n) {
			double j = 0;
			double y = 1;
			int i=0;
			while (i<n) {
				if (i>0) {
					y = y*(-x*x)/1;
					}
					j += 1;
					i++;
				}
				return j;
			}
	}
