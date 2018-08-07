package cibcCustomer;

import cibcCustomer.studentCustomer;
import cibcCustomer.vipCustomer;
import cibcCustomer.bussinessCustomer;
import cibcCustomer.cibcCustomer;
import java.util.*;

public class customerInfo {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<cibcCustomer> cibcCustomers;
	private int typeOfAccount;
	
	public customerInfo() {
		this.cibcCustomers = new ArrayList<cibcCustomer>();
	}
	
	public void printCustomerInformation() {
		System.out.println("STARTING TO PRINT CUSTOMER INFORMATION ... ");
		for (int counter = 0; counter < this.cibcCustomers.size(); ++counter) {
			cibcCustomers.get(counter).printCustomerInformation();
		}
	}
	
	public int findCustomerByOB(cibcCustomer cibcCustomer) {
		return this.cibcCustomers.indexOf(cibcCustomer);
	}
	
	public int findCustomerByName(String customerName) {
		for (int counter = 0; counter < this.cibcCustomers.size(); ++counter) {
			if (cibcCustomers.get(counter).getCustomerName().equals(customerName)) {
				return counter;
			}
		}
		return -1;
	}
	
	public int findCustomerBySinNumber(String sinNumber) {
		for (int counter = 0; counter < this.cibcCustomers.size(); ++counter) {
			if (cibcCustomers.get(counter).getCustomerSinnumber().equals(sinNumber)) {
				return counter;
			}
		}
		return -1;
	}
	
	public int findCustomerByAccNumber(String AccNumber) {
		for (int counter = 0; counter < this.cibcCustomers.size(); ++counter) {
			if (cibcCustomers.get(counter).getCustomerAccountNumber().equals(AccNumber)) {
				return counter;
			}
		}
		return -1;
	}
	
	public boolean addNewCustomer() {
		System.out.println("ENTER CUSTOMER S.I.N NUMBER AT HERE: ");
		String sinNumber = scanner.nextLine();
		int position = findCustomerBySinNumber(sinNumber);
		if (position < 0) {
			System.out.println("ENTER CUSTOMER NAME AT HERE: ");
			String customerName = scanner.nextLine();
			System.out.println("ENTER CUSTOMER GENDER AT HERE: ");
			String customerGender = scanner.nextLine();
			System.out.println("ENTER CUSTOMER AGE AT HERE: ");
			int customerAge = scanner.nextInt();
			scanner.nextLine();
			System.out.println("ENTER CUSTOMER BACKGROUND AT HERE: ");
			String customerBackground = scanner.nextLine();
			System.out.println("ENTER CUSTOMER ADDRESS AT HERE: ");
			String customerAddress = scanner.nextLine();
			System.out.println("ENTER CUSTOMER EMAIL AT HERE: ");
			String customerEmail = scanner.nextLine();
			System.out.println("ENTER CUSTOMER PHONE NUMBER AT HERE: ");
			String customerPhonenumber = scanner.nextLine();
			System.out.println("ENTER CUSTOMER ACCOUNT NUMBER AT HERE: ");
			String customerAccNumber = scanner.nextLine();
			System.out.println("ENTER CUSTOMER BALANCE AT HERE: ");
			double customerBalance = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("ENTER CUSTOMER PIN CODE AT HERE: ");
			double customerPinCode = scanner.nextDouble(); 
			scanner.nextLine();
			System.out.println("ENTER TYPE OF ACCOUNT: \n1--DEBIT\n2--CREDIT");
			String choice = scanner.nextLine();
			choice = choice.toUpperCase();
			if (choice.equals("DEBIT")) {
				cibcCustomer studentAccount = new studentCustomer(sinNumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail, customerPhonenumber, customerAccNumber, customerBalance, customerPinCode);
				this.cibcCustomers.add(studentAccount);
				return true;
			}
			else if (choice.equals("CREDIT")) {
				System.out.println("ENTER TYPE OF CREDIT ACCOUNT: \n1--VIP\n2--BUSINESS ");
				String creditChoice = scanner.nextLine();
				if (creditChoice.equals("VIP")) {
					cibcCustomer vipAccount = new vipCustomer(sinNumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail, customerPhonenumber, customerAccNumber, customerBalance, customerPinCode);
					this.cibcCustomers.add(vipAccount);
					return true;
				}
				else if (creditChoice.equals("BUSINESS")) {
					cibcCustomer businessAccount = new bussinessCustomer(sinNumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail, customerPhonenumber, customerAccNumber, customerBalance, customerPinCode);
					this.cibcCustomers.add(businessAccount);
					return true;
				}
			}
			return true;
		}
		else {
			System.out.println("==== CAN NOT ADD THIS CUSTOMER ====");
			System.out.println("==== CUSTOMER INFORMATION IS ALREADY SET INTO THE SYSTEM ====");
			return false;
		}
	}
		
	public boolean updateCustomerInformation() {
		System.out.println("ENTER CUSTOMER S.I.N NUMBER AT HERE: ");
		String sinNumber = scanner.nextLine();
		int postition = findCustomerBySinNumber(sinNumber);
		if (postition >= 0) {
			System.out.println("ENTER CUSTOMER NAME AT HERE: ");
			String customerName = scanner.nextLine();
			System.out.println("ENTER CUSTOMER GENDER AT HERE: ");
			String customerGender = scanner.nextLine();
			System.out.println("ENTER CUSTOMER AGE AT HERE: ");
			int customerAge = scanner.nextInt();
			scanner.nextLine();
			System.out.println("ENTER CUSTOMER BACKGROUND AT HERE: ");
			String customerBackground = scanner.nextLine();
			System.out.println("ENTER CUSTOMER ADDRESS AT HERE: ");
			String customerAddress = scanner.nextLine();
			System.out.println("ENTER CUSTOMER EMAIL AT HERE: ");
			String customerEmail = scanner.nextLine();
			System.out.println("ENTER CUSTOMER PHONE NUMBER AT HERE: ");
			String customerPhonenumber = scanner.nextLine();
			System.out.println("ENTER CUSTOMER ACCOUNT NUMBER AT HERE: ");
			String customerAccNumber = scanner.nextLine();
			System.out.println("ENTER CUSTOMER BALANCE AT HERE: ");
			double customerBalance = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("ENTER CUSTOMER PIN CODE AT HERE: ");
			double customerPinCode = scanner.nextDouble(); 
			scanner.nextLine();
			System.out.println("ENTER TYPE OF ACCOUNT: \n1--DEBIT\n2--CREDIT");
			String choice = scanner.nextLine();
			choice = choice.toUpperCase();
			if (choice.equals("DEBIT")) {
				cibcCustomer studentAccount = new studentCustomer(sinNumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail, customerPhonenumber, customerAccNumber, customerBalance, customerPinCode);
				this.cibcCustomers.set(postition, studentAccount);
				return true;
			}
			else if (choice.equals("CREDIT")) {
				System.out.println("ENTER TYPE OF CREDIT ACCOUNT: \n1--VIP\n2--BUSINESS ");
				String creditChoice = scanner.nextLine();
				if (creditChoice.equals("VIP")) {
					cibcCustomer vipAccount = new vipCustomer(sinNumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail, customerPhonenumber, customerAccNumber, customerBalance, customerPinCode);
					this.cibcCustomers.set(postition, vipAccount);
					return true;
				}
				else if (creditChoice.equals("BUSINESS")) {
					cibcCustomer businessAccount = new bussinessCustomer(sinNumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail, customerPhonenumber, customerAccNumber, customerBalance, customerPinCode);
					this.cibcCustomers.set(postition, businessAccount);
					return true;
				}
			}
			return true;
		}
		else {
			System.out.println("==== CAN NOT UPDATE THIS CUSTOMER ====");
			System.out.println("==== CUSTOMER INFORMATION IS NOT EXIST IN THE SYSTEM ====");
			return false;
		}
	}
	
	public boolean removeCustomerInformation() {
		System.out.println("ENTER CUSTOMER S.I.N NUMBER AT HERE: ");
		String sinNumber = scanner.nextLine();
		int position = findCustomerBySinNumber(sinNumber);
		if (position >= 0) {
			this.cibcCustomers.remove(position);
			System.out.println("==== CUSTOMER HAS BEEN REMOVED FROM THE SYSTEM ====");
			return true;
		}
		else {
			System.out.println("==== CAN NOT REMOVE ====");
			System.out.println("==== CUSTOMER INFORMATION IS NOT EXIST IN THE SYSTEM ====");
			return false;
		}
	}
	
	public cibcCustomer findCustomerInformationByName() {
		System.out.println("ENTER CUSTOMER NAME AT HERE: ");
		String customerName = scanner.nextLine();
		int position = findCustomerByName(customerName);
		if (position >= 0) {
			this.cibcCustomers.get(position).printCustomerInformation();
		}
		return null;
	}
	
	public cibcCustomer findCustomerInformationBySinNumber() {
		System.out.println("ENTER CUSTOMER SIN NUMBER AT HERE: ");
		String sinNumber = scanner.nextLine();
		int position = findCustomerBySinNumber(sinNumber);
		if (position >= 0) {
			this.cibcCustomers.get(position).printCustomerInformation();
		}
		return null;
	}
	
	public void depositCustomerMoney() {
		System.out.println("ENTER CUSTOMER SIN NUMBER AT HERE: ");
		String customerSinNumber = scanner.nextLine();
		int position = findCustomerBySinNumber(customerSinNumber);
		if (position >= 0) {
			System.out.println("ENTER CUSTOMER PIN CODE AT HERE: ");
			double pinCode = scanner.nextDouble();
			scanner.nextLine();
			this.cibcCustomers.get(position).depositMoney(pinCode);
		}
		else {
			System.out.println("==== CUSTOMER INFORMATION IS NOT IN THE SYSTEM ====");
		}
	}
	
	public void withdrawCustomerMoney() {
		System.out.println("ENTER CUSTOMER SIN NUMBER AT HERE: ");
		String customerSinNumber = scanner.nextLine();
		int position = findCustomerBySinNumber(customerSinNumber);
		if (position >= 0) {
			System.out.println("ENTER CUSTOMER PIN CODE AT HERE: ");
			double pinCode = scanner.nextDouble();
			scanner.nextLine();
			this.cibcCustomers.get(position).withDrawMoney(pinCode);
		}
		else {
			System.out.println("==== CUSTOMER INFORMATION IS NOT IN THE SYSTEM ====");
		}
	}
}









