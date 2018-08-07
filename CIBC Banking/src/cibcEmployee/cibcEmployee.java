package cibcEmployee;

import java.util.Scanner;

public class cibcEmployee {
	private static Scanner scanner = new Scanner(System.in);
	
	protected String employeeSinnumber;
	protected String employeeName;
	protected String employeeGender;
	protected int employeeAge;
	protected String employeeBackground;
	protected String employeeAddress;
	protected String employeeEmail;
	protected String employeePhoneNumber;
	protected String employeeAccountNumber;
	protected double employeeBalance;
	protected double employeePinCode;
	protected double employeeIncome;
	
	public cibcEmployee(String employeeSinnumber, String employeeName, String employeeGender, int employeeAge,
			String employeeBackground, String employeeAddress, String employeeEmail, String employeePhoneNumber,
			String employeeAccountNumber, double employeeBalance, double employeePinCode, double employeeIncome) {
		super();
		this.employeeSinnumber = employeeSinnumber;
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeAge = employeeAge;
		this.employeeBackground = employeeBackground;
		this.employeeAddress = employeeAddress;
		this.employeeEmail = employeeEmail;
		this.employeePhoneNumber = employeePhoneNumber;
		this.employeeAccountNumber = employeeAccountNumber;
		this.employeeBalance = employeeBalance;
		this.employeePinCode = employeePinCode;
		this.employeeIncome = employeeIncome;
	}

	public String getemployeeSinnumber() {
		return employeeSinnumber;
	}

	public void setemployeeSinnumber(String employeeSinnumber) {
		this.employeeSinnumber = employeeSinnumber;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getemployeeGender() {
		return employeeGender;
	}

	public void setemployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public int getemployeeAge() {
		return employeeAge;
	}

	public void setemployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getemployeeBackground() {
		return employeeBackground;
	}

	public void setemployeeBackground(String employeeBackground) {
		this.employeeBackground = employeeBackground;
	}

	public String getemployeeAddress() {
		return employeeAddress;
	}

	public void setemployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getemployeeEmail() {
		return employeeEmail;
	}

	public void setemployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getemployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public void setemployeePhoneNumber(String employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

	public String getemployeeAccountNumber() {
		return employeeAccountNumber;
	}

	public void setemployeeAccountNumber(String employeeAccountNumber) {
		this.employeeAccountNumber = employeeAccountNumber;
	}

	public double getemployeeBalance() {
		return employeeBalance;
	}

	public void setemployeeBalance(double employeeBalance) {
		this.employeeBalance = employeeBalance;
	}

	public double getemployeePinCode() {
		return employeePinCode;
	}

	public void setemployeePinCode(double employeePinCode) {
		this.employeePinCode = employeePinCode;
	}

	public double getemployeeIncome() {
		return employeeIncome;
	}

	public void setemployeeIncome(double employeeIncome) {
		this.employeeIncome = employeeIncome;
	}
	
	public void printEmployeeInformation() {
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("=          EMPLOYEE BANKING INFORMATION          =");
		System.out.println("==================================================");
		System.out.println("====EMPLOYEE SIN NUMBER: " + employeeSinnumber + " ====");
		System.out.println("====EMPLOYEE NAME: " + employeeName +" ====");
		System.out.println("====EMPLOYEE GENDER: " + employeeGender + " ====");
		System.out.println("====EMPLOYEE AGE: " + employeeAge + " ====");
		System.out.println("====EMPLOYEE BACKGROUND: " + employeeBackground + " ====");
		System.out.println("====EMPLOYEE ADDRESS: " + employeeAddress + " ====");
		System.out.println("====EMPLOYEE EMAIL: " + employeeEmail + " ====");
		System.out.println("====EMPLOYEE PHONE NUMBER " + employeePhoneNumber + " ====");
		System.out.println("====EMPLOYEE ACCOUNT NUMBER: " + employeeAccountNumber + " ====");
		System.out.println("====EMPLOYEE PIN CODE: " + employeePinCode + " ====");
		System.out.println("====EMPLOYEE BALANCE: " + employeeBalance + " ====");
		System.out.println("====EMPLOYEE INCOME: " + employeeIncome + " ====");
	}
	
	public void showFulltimeEmpInfo() {
		
	}
	
	public boolean depositMoney(double pinCode) {
		if (this.employeePinCode == pinCode) {
			System.out.print("ENTER THE AMOUNT OF MONEY YOU WANT TO DEPOSIT: ");
			double depositAmount = scanner.nextDouble();
			scanner.nextLine();
			employeeBalance = employeeBalance + depositAmount;
			System.out.println("employee NEW BALANCE: " + employeeBalance +"$");
			return true;
		}
		else {
			System.out.println("==== YOUR TRANSACTION HAS BEEN REFUSED ====");
			System.out.println("==== WRONG PIN CODE NUMBER ====");
			return false;
		}
	}
	
	public boolean withDrawMoney(double pinCode) {
		if (this.employeePinCode == pinCode) {
			System.out.print("ENTER THE AMOUNT OF MONEY YOU WANT TO WITHDRAW: ");
			double withdrawAmount = scanner.nextDouble();
			scanner.nextLine();
			if (withdrawAmount <= employeeBalance) {
				employeeBalance = employeeBalance - withdrawAmount;
				System.out.println("employee NEW BALANCE: " + employeeBalance + "$");
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
	
	public String findEmployeeIncomeAndOcc() {
		// This one will calculate and return the income of the employee
		// Information of income will be calculated base one these factors
		// Employee income
		// Employee extra working hours
		return "==== NOTHING HAS BEEN SET !!! ====";
	}
	
	public cibcEmployee createNewEmployee(String employeeSinnumber, String employeeName, String employeeGender, int employeeAge,
			String employeeBackground, String employeeAddress, String employeeEmail, String employeePhoneNumber,
			String employeeAccountNumber, double employeeBalance, double employeePinCode, double employeeIncome) {
		return new cibcEmployee(employeeSinnumber, employeeName, employeeGender, employeeAge, employeeBackground, employeeAddress, employeeEmail, employeePhoneNumber, employeeAccountNumber, employeeBalance, employeePinCode, employeeIncome);
	}
}
