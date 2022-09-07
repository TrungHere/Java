import java.util.Scanner;

public class whille {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int x;
		//System.out.println("nhap x: ");
		//x= sc.nextInt();
		//while (x!=0) {
			for (int u = 2; u <= 9; u++) {
				for (int t =1 ; t <= 10; t++) {
					int g = u * t;
					System.out.println(u +" x "+ t +" = "+ g);
					
				}
				System.out.println("============");
				
			}
		//}
	}

}
