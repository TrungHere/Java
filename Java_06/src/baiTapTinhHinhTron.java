import java.util.Scanner;

public class baiTapTinhHinhTron {
	public static void main(String[] args) {
		double r , chuVi , dienTich;
		Scanner sc = new Scanner(System.in);
		
		//Ban kinh 
		r = sc.nextDouble();
		System.out.println("nhap ban kinh r: " + r);
		
		//tinh Chu vi
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi = "+ chuVi);
		System.out.println("CHu vi = "+ Math.round(chuVi));
		System.out.println("CHu vi = "+ Math.round(chuVi*100.0)/100.0);
		
		
		// tinh dien tich 
		dienTich = Math.PI * Math.pow(r, 2);
		System.out.println("Dien tich = "+ dienTich);
		System.out.println("dien tich = " + Math.round(dienTich));
		
	}
}
