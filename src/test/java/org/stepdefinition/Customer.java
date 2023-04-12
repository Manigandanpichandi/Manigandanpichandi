package org.stepdefinition;

public class Customer {
	private void Customername(String name) {
		// TODO Auto-generated method stub
System.out.println("Customer Nmae:"+name);
	}
	private void Customername(int Phone , String Adress) {
		// TODO Auto-generated method stub
System.out.println("CUstomer Phone number:"+Phone);
System.out.println("CUstomer Phone number:"+Adress);
}
	private void Customername(Float Salary,Long PF) {
		// TODO Auto-generated method stub
System.out.println("Customer Salary:"+Salary);
System.out.println("CUstomer Phone number:"+PF);
	}
	public static void main(String[] args) {
		Customer n = new Customer();
		n.Customername("Manigandan");
	n.Customername(9626, "gudiyatham");	
	n.Customername(543678f, 67589343l);
	}
}