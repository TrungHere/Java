package coffeeBills;

public class coffeeBill {
	private String coffeType;
	private double price;
	private double weigh;
	//private double discount;
	public coffeeBill(String n, double p, double w) {
		this.coffeType = n;
		this.price = p;
		this.weigh = w;
		//this.discount = x;
		
		
	}
	
	
	public double totalBill() {
		return this.price*this.weigh;
	}
	public boolean testcase_Weigh_larger(double w) {
		/*if(this.weigh > w) {
		 * 		return true;
		 * }else {
		 * 		return false;
		 * }
		 */
		return this.weigh > w;
	}
	public boolean testcase_bill_larger500k() {
		return this.totalBill() > 500;
	}
	public double discount(double x) {
		if(this.totalBill()>500) {
			return (x / 100) * this.totalBill();
		}else {
			return 0;
		}
	}
	public double totallBills() {
		return this.totalBill()-this.discount(price);
	}

}
