
public class breakk_conttinue_rreturn {
	public static void main(String[] args) {
		int I, J = 0;
		LABEL: for (I = 0; I < 10; I++) {
			for (J = 0; J < 20; J++) {
				if (J > 14)
					break LABEL;
			}
			System.out.println("bên trong I = " + I + ", J = " + J);
		}
		System.out.println("bên ngoài I = " + I + ", J = " + J);
	}
}
