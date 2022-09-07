import java.util.Scanner;

public class wwhile2 {
	public static void main(String[] args) {
		int u;
		Scanner sc = new Scanner(System.in);
		u = sc.nextInt();
		
		
		String nhiPhan = "";
		while(u>0) {
			nhiPhan = (u%2) + nhiPhan;
			u=u/2;
		}
		System.out.println("he nhi phan: "+nhiPhan);
		/*
		 * Nhi Phan La Chia lien tuc cho 2 va lay phan du =>>> x=x/2
		 * dao nguoc chuoi => ketQua
		 * 10/2=5 du 0   | 
		 * 5/2=2 du 1    |
		 * 2/2=1 du 0    |to sum up => (x%2)+ketQua
		 * 1/2=0 du 1    |
		 * =>1010        |
		 */
		
	}
}
