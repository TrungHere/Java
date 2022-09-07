import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		int u;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhap so >0");
			u=sc.nextInt();
		}while (u<0);
	}
}
