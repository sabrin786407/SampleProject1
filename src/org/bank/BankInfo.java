package org.bank;

public class BankInfo extends AxisBank{
	public void savings() {
		System.out.println("savings is 20%");

	}
	public void fixed() {
		System.out.println("fixed is 40%");

	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.savings();
		b.deposit();
		b.fixed();
		
	}

}
