import java.util.Scanner;

public class array_00 {
	public static void main(String[] args) {
		double mang1[];
		mang1 = new double[10];
		System.out.println("nhap du lieu vao mang1 :");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mang1.length; i++) {
			System.out.println("nhap phan tu thu "+i+ " : ");
			mang1[i]= sc.nextDouble();
		}
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong += mang1[i];
		}
		System.out.println("tong = "+ tong);
	}
}
