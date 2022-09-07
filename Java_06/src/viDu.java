import java.util.Scanner;

public class viDu {
	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		System.out.println("nhap a");
		b = sc.nextDouble();
		System.out.println("nhap b");
		
		
		//ham tri tuyet doi 
		System.out.println("|a| = "+ Math.abs(a));
		//ham tim min
		System.out.println("min(a,b) = " + Math.min(a, b));
		//ham tim max
		System.out.println("max(a,b) = " + Math.max(a, b));
		//ham tim ceil
		System.out.println("ceil(a) = " + Math.ceil(a));
		//ham tim floor
		System.out.println("floor(a) = " + Math.floor(a));
		//ham bac hai sqrt
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		//ham bac hai a^b
		System.out.println("a^b = " + Math.pow(a , b));
				
				
				
		
	}
}
