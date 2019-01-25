
public class Pay {
	//declare data fields
	private int skillLevel;
	private double hourlyRate;
	private int hoursWorked;
	private double regPay, overPay, totalPay;
	private double medInsRate = 0.00;
	private double dentInsRate = 0.00;
	private double disabInsRate = 0.00;
	private double retPlanRate = 0.00;
	private double totalDeduction;
	//constructor
	public Pay(int s, int hw) {
		this.skillLevel = s;
		this.hoursWorked = hw;
		this.setHourlyRate();
	}
	//methods - totalPay
	/*
	 * name: totalPay
	 * input: -
	 * output: void
	 */
	public void setHourlyRate() {
		switch (skillLevel) {
		case 3: this.hourlyRate = 22.00; break;
		case 2: this.hourlyRate = 20.00; break;
		case 1: this.hourlyRate = 17.00; break;
		default: System.out.println("Invalid skillset!");
		}
	}
	public void setDeduction(boolean mi, boolean di, boolean dsi, boolean rp) {
		if (mi == true) 
			medInsRate = 32.50;
		
		if (di == true) 
			dentInsRate = 20.00;
		
		if (dsi == true)
			disabInsRate = 10.00;
		
		if (rp == true)
			retPlanRate = 0.03;
	}
	public void calPay() {
		if (hoursWorked > 40) {
			regPay = hourlyRate * 40;
			overPay = (hoursWorked - 40) * hourlyRate * 1.5;
		}	
		else
			regPay = hoursWorked * hourlyRate;
		totalPay = regPay + overPay;	
	}
	public double calDeduction() {
		totalDeduction = medInsRate + dentInsRate + disabInsRate + retPlanRate*totalPay;
		if (totalDeduction > totalPay) {
			System.out.println("Total deduction can't be greater than gross pay!");
			return 0;
		}
		else
			return (this.totalPay - totalDeduction);
	}
	public void display() {
		System.out.println("Pay check: ");
		System.out.printf("\t%-30s%-5d\n","The hours worked: ", hoursWorked);
		System.out.printf("\t%-30s%-5.2f\n","Hourly pay rate: ", hourlyRate);
		System.out.printf("\t%-30s%-5.2f\n","Regular pay for 40 hours: ", regPay);
		System.out.printf("\t%-30s%-5.2f\n","Overtime pay: ", overPay);
		System.out.printf("\t%-30s%-5.2f\n","Total pay: ", totalPay);
		System.out.printf("\t%-30s\n","Deduction: ");
		System.out.printf("\t\t%-22s%-5.2f\n","Medical: ", medInsRate);
		System.out.printf("\t\t%-22s%-5.2f\n","Dental: ", dentInsRate);
		System.out.printf("\t\t%-22s%-5.2f\n","Disability: ", disabInsRate);
		System.out.printf("\t\t%-22s%-5.2f\n","Retirement: ", retPlanRate*totalPay);	
		System.out.printf("\t%-30s%-5.2f\n","Total: ", calDeduction());
	}
}


