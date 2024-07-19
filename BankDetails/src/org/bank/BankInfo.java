package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("30000");
	}
	private void fixed() {
		System.out.println("20000");
	}
	public static void main(String[] args) {
		BankInfo Info = new BankInfo();
		Info.savings();
		Info.fixed();
		Info.deposit();
	}
}
