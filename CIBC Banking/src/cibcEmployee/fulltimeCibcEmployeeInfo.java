package cibcEmployee;

import cibcEmployee.cibcEmployee;
import cibcEmployee.fulltimeCibcEmployee;

import java.util.*;

import cibcConfigure.cibcConfig;

public class fulltimeCibcEmployeeInfo {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<cibcEmployee> cibcEmployee;
	
	public fulltimeCibcEmployeeInfo() {
		this.cibcEmployee = new ArrayList<cibcEmployee>();
	}
	
	public void printEmployeeInformation() {
		System.out.println("STARTING TO PRINT EMPLOYEE INFORMATION ... ");
		for (int counter = 0; counter < this.cibcEmployee.size(); ++counter) {
			cibcEmployee.get(counter).showFulltimeEmpInfo();
		}
	}
	
	public int findEmployeeByOB(cibcEmployee cibcEMPLOYEE) {
		return this.cibcEmployee.indexOf(cibcEMPLOYEE);
	}
	
	public int findEmployeeByName(String employeeName) {
		for (int counter = 0; counter < this.cibcEmployee.size(); ++counter) {
			if (this.cibcEmployee.get(counter).getemployeeName().equals(employeeName)) {
				return counter;
			}
		}
		return -1;
	}
	
	public int findEmployeeBySinNumber(String sinNumber) {
		for (int counter = 0; counter < this.cibcEmployee.size(); ++counter) {
			if (this.cibcEmployee.get(counter).getemployeeSinnumber().equals(sinNumber)) {
				return counter;
			}
		}
		return -1;
	}
	
	public int findEmployeeByAccNumber(String accNumber) {
		for (int counter = 0; counter < this.cibcEmployee.size(); ++counter) {
			if (this.cibcEmployee.get(counter).getemployeeAccountNumber().equals(accNumber)) {
				return counter;
			}
		}
		return -1;
	}
	
	public boolean addNewEmployee() {
		System.out.println("ENTER EMPLOYEE S.I.N NUMBER AT HERE: ");
		String sinNumber = scanner.nextLine();
		int position = findEmployeeBySinNumber(sinNumber);
		if (position < 0) {
			System.out.println("ENTER EMPLOYEE NAME AT HERE: ");
			String EmployeeName = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE GENDER AT HERE: ");
			String EmployeeGender = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE AGE AT HERE: ");
			int EmployeeAge = scanner.nextInt();
			scanner.nextLine();
			System.out.println("ENTER EMPLOYEE BACKGROUND AT HERE: ");
			String EmployeeBackground = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE ADDRESS AT HERE: ");
			String EmployeeAddress = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE EMAIL AT HERE: ");
			String EmployeeEmail = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE PHONE NUMBER AT HERE: ");
			String EmployeePhonenumber = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE ACCOUNT NUMBER AT HERE: ");
			String EmployeeAccNumber = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE BALANCE AT HERE: ");
			double EmployeeBalance = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("ENTER EMPLOYEE PIN CODE AT HERE: ");
			double EmployeePinCode = scanner.nextDouble(); 
			scanner.nextLine();
			fulltimeCibcEmployee fulltimeCibcEmployee = new fulltimeCibcEmployee(sinNumber, EmployeeName, EmployeeGender, EmployeeAge, EmployeeBackground, EmployeeAddress, EmployeeEmail, EmployeePhonenumber, EmployeeAccNumber, EmployeeBalance, EmployeePinCode, 0);
			// Create extra information
			System.out.println("ENTER EMPLOYEE EXTRA HOUR: ");
			double EmployeeExHour = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("ENTER EMPLOYEE OCCUPATION AT HERE: \n1--FINANCIAL MANAGER\n2--LOAN OFFICER\n3--BANK TELLER\n4--FINANCIAL ANALYST\n5--IT MAN\n6--CIBC CLEANER");
			double EmployeeOcc = scanner.nextDouble();
			scanner.nextLine();
			
			if (EmployeeOcc == 1) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCFINANCIALMANAGER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.add(fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 2) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCLOANOFFICER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.add(fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 3) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCBANKTELLER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.add(fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 4) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCFINANCIALANALYST);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.add(fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 5) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCITMAN);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.add(fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 6) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCCLEANER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.add(fulltimeCibcEmployee);
				return true;
			}
		}
		else {
			System.out.println("==== CAN NOT ADD EMPLOYEE INFORMATION INTO THE SYSTEM ====");
			System.out.println("==== EMPLOYEE INFORMATION ALREADY EXIST ====");
			return false;
		}
		return false;
	}
	
	public boolean updateEmployeeInformation() {
		System.out.println("ENTER EMPLOYEE S.I.N NUMBER AT HERE: ");
		String sinNumber = scanner.nextLine();
		int position = findEmployeeBySinNumber(sinNumber);
		if (position >= 0) {
			System.out.println("ENTER EMPLOYEE NAME AT HERE: ");
			String EmployeeName = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE GENDER AT HERE: ");
			String EmployeeGender = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE AGE AT HERE: ");
			int EmployeeAge = scanner.nextInt();
			scanner.nextLine();
			System.out.println("ENTER EMPLOYEE BACKGROUND AT HERE: ");
			String EmployeeBackground = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE ADDRESS AT HERE: ");
			String EmployeeAddress = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE EMAIL AT HERE: ");
			String EmployeeEmail = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE PHONE NUMBER AT HERE: ");
			String EmployeePhonenumber = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE ACCOUNT NUMBER AT HERE: ");
			String EmployeeAccNumber = scanner.nextLine();
			System.out.println("ENTER EMPLOYEE BALANCE AT HERE: ");
			double EmployeeBalance = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("ENTER EMPLOYEE PIN CODE AT HERE: ");
			double EmployeePinCode = scanner.nextDouble(); 
			scanner.nextLine();
			fulltimeCibcEmployee fulltimeCibcEmployee = new fulltimeCibcEmployee(sinNumber, EmployeeName, EmployeeGender, EmployeeAge, EmployeeBackground, EmployeeAddress, EmployeeEmail, EmployeePhonenumber, EmployeeAccNumber, EmployeeBalance, EmployeePinCode, 0);
			// Create extra information
			System.out.println("ENTER EMPLOYEE EXTRA HOUR: ");
			double EmployeeExHour = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("ENTER EMPLOYEE OCCUPATION AT HERE: \n1--FINANCIAL MANAGER\n2--LOAN OFFICER\n3--BANK TELLER\n4--FINANCIAL ANALYST\n5--IT MAN\n6--CIBC CLEANER");
			double EmployeeOcc = scanner.nextDouble();
			scanner.nextLine();
			
			if (EmployeeOcc == 1) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCFINANCIALMANAGER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.set(position, fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 2) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCLOANOFFICER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.set(position, fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 3) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCBANKTELLER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.set(position, fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 4) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCFINANCIALANALYST);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.set(position, fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 5) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCITMAN);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.set(position, fulltimeCibcEmployee);
				return true;
			}
			else if (EmployeeOcc == 6) {
				fulltimeCibcEmployee.setEmployeeType(cibcConfig.EMPCIBCCLEANER);
				fulltimeCibcEmployee.setWorkingHour(EmployeeExHour);
				cibcEmployee.set(position, fulltimeCibcEmployee);
				return true;
			}
		}
		else {
			System.out.println("==== CAN NOT UPDATE EMPLOYEE INFORMATION ====");
			System.out.println("==== EMPLOYEE INFORMATION IS NOT IN THE SYSTEM ====");
			return false;
		}
		return false;
	}
	
	public boolean removeEmployeeInformation() {
		System.out.println("ENTER EMPLOYEE S.I.N NUMBER AT HERE: ");
		String sinNumber = scanner.nextLine();
		int position = findEmployeeBySinNumber(sinNumber);
		if (position >= 0) {
			this.cibcEmployee.remove(position);
			System.out.println("==== EMPLOYEE INFORMATION HAS BEEN REMOVED FROM THE SYSTEM ====");
			return true;
		}
		else {
			System.out.println("==== CAN NOT REMOVE EMPLOYEE INFORMATION ====");
			System.out.println("==== EMPLOYEE INFORMATION IS NOT EXIST IN THE SYSTEM ====");
			return false;
		}
	}
	
	public cibcEmployee printEmployeeInformationByName() {
		System.out.println("ENTER EMPLOYEE NAME AT HERE: ");
		String employeeName = scanner.nextLine();
		int postion = findEmployeeByName(employeeName);
		if (postion >= 0) {
			this.cibcEmployee.get(postion).printEmployeeInformation();
		}
		System.out.println("==== CAN NOT FIND EMPLOYEE INFORMATION ====");
		System.out.println("==== EMPLOYEE INFORMATION IS NOT IN THE SYSTEM ====");
		return null;
	}
	
	public cibcEmployee printEmployeeInformationBySinNumber() {
		System.out.println("ENTER EMPLOYEE S.I.N NUMBER AT HERE: ");
		String employeeSinNumber = scanner.nextLine();
		int position = findEmployeeBySinNumber(employeeSinNumber);
		if (position >= 0) {
			this.cibcEmployee.get(position).printEmployeeInformation();
		}
		return null;
	}
	
	public void depositEmployeeMoney() {
		System.out.println("ENTER EMPLOYEE S.I.N NUMBER AT HERE: ");
		String employeeSinNumber = scanner.nextLine();
		int position = findEmployeeBySinNumber(employeeSinNumber);
		if (position >= 0) {
			System.out.println("ENTER EMPLOYEE PIN CODE AT HERE: ");
			double pinCode = scanner.nextDouble();
			scanner.nextLine();
			this.cibcEmployee.get(position).depositMoney(pinCode);
		}
		else {
			System.out.println("==== CUSTOMER INFORMATION IS NOT IN THE SYSTEM ====");
		}
	}
	
	public void withdrawEmployeeMoney() {
		System.out.println("ENTER EMPLOYEE S.I.N NUMBER AT HERE: ");
		String customerSinNumber = scanner.nextLine();
		int position = findEmployeeBySinNumber(customerSinNumber);
		if (position >= 0) {
			System.out.println("ENTER CUSTOMER PIN CODE AT HERE: ");
			double pinCode = scanner.nextDouble();
			scanner.nextLine();
			this.cibcEmployee.get(position).withDrawMoney(pinCode);
		}
		else {
			System.out.println("==== CUSTOMER INFORMATION IS NOT IN THE SYSTEM ====");
		}
	}
}










