package cibcCustomer;

import java.util.Scanner;

public class cibcCustomer {
	private static Scanner scanner = new Scanner(System.in);
	
	protected String customerSinnumber;
	protected String customerName;
	protected String customerGender;
	protected int customerAge;
	protected String customerBackground;
	protected String customerAddress;
	protected String customerEmail;
	protected String customerPhoneNumber;
	protected String customerAccountNumber;
	protected double customerBalance;
	protected double customerPinCode;
	
	public cibcCustomer(String customerSinnumber, String customerName, String customerGender, int customerAge,
			String customerBackground, String customerAddress, String customerEmail, String customerPhoneNumber,
			String customerAccountNumber, double customerBalance, double customerPinCode) {
		super();
		this.customerSinnumber = customerSinnumber;
		this.customerName = customerName;
		this.customerGender = customerGender;
		this.customerAge = customerAge;
		this.customerBackground = customerBackground;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerAccountNumber = customerAccountNumber;
		this.customerBalance = customerBalance;
		this.customerPinCode = customerPinCode;
	}

	public String getCustomerSinnumber() {
		return customerSinnumber;
	}

	public void setCustomerSinnumber(String customerSinnumber) {
		this.customerSinnumber = customerSinnumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerBackground() {
		return customerBackground;
	}

	public void setCustomerBackground(String customerBackground) {
		this.customerBackground = customerBackground;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(String customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public double getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(double customerBalance) {
		this.customerBalance = customerBalance;
	}	
	
	public double getCustomerPinCode() {
		return customerPinCode;
	}

	public void setCustomerPinCode(double customerPinCode) {
		this.customerPinCode = customerPinCode;
	}

	public void printCustomerInformation() {
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("=          CUSTOMER BANKING INFORMATION          =");
		System.out.println("==================================================");
		System.out.println("====CUSTOMER SIN NUMBER: " + customerSinnumber + " ====");
		System.out.println("====CUSTOMER NAME: " + customerName +" ====");
		System.out.println("====CUSTOMER GENDER: " + customerGender + " ====");
		System.out.println("====CUSTOMER AGE: " + customerAge + " ====");
		System.out.println("====CUSTOMER BACKGROUND: " + customerBackground + " ====");
		System.out.println("====CUSTOMER ADDRESS: " + customerAddress + " ====");
		System.out.println("====CUSTOMER EMAIL: " + customerEmail + " ====");
		System.out.println("====CUSTOMER PHONE NUMBER " + customerPhoneNumber + " ====");
		System.out.println("====CUSTOMER ACCOUNT NUMBER: " + customerAccountNumber + " ====");
		System.out.println("====CUSTOMER PIN CODE: " + customerPinCode + " ====");
		System.out.println("====CUSTOMER BALANCE: " + customerBalance + " ====");
	}
	
	public boolean depositMoney(double pinCode) {
		if (this.customerPinCode == pinCode) {
			System.out.print("ENTER THE AMOUNT OF MONEY YOU WANT TO DEPOSIT: ");
			double depositAmount = scanner.nextDouble();
			scanner.nextLine();
			customerBalance = customerBalance + depositAmount;
			System.out.println("CUSTOMER NEW BALANCE: " + customerBalance +"$");
			return true;
		}
		else {
			System.out.println("==== YOUR TRANSACTION HAS BEEN REFUSED ====");
			System.out.println("==== WRONG PIN CODE NUMBER ====");
			return false;
		}
	}
	
	public boolean withDrawMoney(double pinCode) {
		if (this.customerPinCode == pinCode) {
			System.out.print("ENTER THE AMOUNT OF MONEY YOU WANT TO WITHDRAW: ");
			double withdrawAmount = scanner.nextDouble();
			scanner.nextLine();
			if (withdrawAmount <= customerBalance) {
				customerBalance = customerBalance - withdrawAmount;
				System.out.println("CUSTOMER NEW BALANCE: " + customerBalance + "$");
				System.out.println("YOU HAVE WITHDRAWN " + withdrawAmount + "$ FROM YOUR ACCOUNT");
				return true;
			}
			else {
				System.out.println("==== YOUR TRANSACTION HAS BEEN REFUSED ====");
				System.out.println("==== YOU DO NOT HAVE ENOUGH MONEY TO WITHDRAW ====");
				return false;
			}
		}
		else {
			System.out.println("==== YOUR TRANSACTION HAS BEEN REFUSED ====");
			System.out.println("==== WRONG PIN CODE NUMBER ====");
			return false;
		}
	}
	
	public cibcCustomer createNewCustomer(String customerSinnumber, String customerName, String customerGender, int customerAge,
			String customerBackground, String customerAddress, String customerEmail, String customerPhoneNumber,
			String customerAccountNumber, double customerBalance, double customerPinCode) {
		return new cibcCustomer(customerSinnumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail, customerPhoneNumber, customerAccountNumber, customerBalance, customerPinCode);
	}
}
