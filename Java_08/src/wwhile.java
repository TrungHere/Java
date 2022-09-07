import java.util.Scanner;

public class wwhile {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		while (x!=0) {
			System.out.println("press 0 to exit");
			x = sc.nextInt();
		}
	}
}
