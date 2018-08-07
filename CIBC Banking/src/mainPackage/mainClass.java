package mainPackage;

import java.util.*;
import cibcCustomer.customerInfo;
import cibcEmployee.cibcEmployee;
import cibcEmployee.fulltimeCibcEmployeeInfo;

public class mainClass {
	private static Scanner scanner = new Scanner(System.in);
	private static customerInfo customerInfo = new customerInfo();
	private static fulltimeCibcEmployeeInfo fulltimeCibcEmployeeInfo = new fulltimeCibcEmployeeInfo();
	
	public static void printInstruction() {
		System.out.println("");
		System.out.println("===============================");
		System.out.println("===== PROGRAM INSTRUCTION =====");
		System.out.println("===============================");
		System.out.println("==== 0--PRINT INSTRUCTION ====");
		System.out.println("==== 1--PRINT CUSTOMER INFORMATION ====");
		System.out.println("==== 2--ADD NEW CUSTOMER ====");
		System.out.println("==== 3--UPDATE CUSTOMER INFORMATION ====");
		System.out.println("==== 4--REMOVE CUSTOMER INFORMATION ====");
		System.out.println("==== 5--FIND CUSTOMER INFORMATION BY NAME ====");
		System.out.println("==== 6--FIND CUSTOMER INFORMATION BY S.I.N NUMBER ====");
		System.out.println("==== 7--DEPOSIT CUSTOMER MONEY ====");
		System.out.println("==== 8--WITHDRAW CUSTOMER MONEY ====");
		System.out.println("==== 9--PRINT EMPLOYEE INFORMATION ====");
		System.out.println("==== 10--ADD NEW EMPLOYEE INFORMATION ====");
		System.out.println("==== 11--UPDATE EMPLOYEE INFORMATION ====");
		System.out.println("==== 12--REMOVE EMPLOYEE INFORMATION ====");
		System.out.println("==== 13--FIND EMPLOYEE INFORMATION BY NAME ====");
		System.out.println("==== 14--FIND EMPLOYEE INFORMATION BY S.I.N NUMBER ====");
		System.out.println("==== 15--DEPOSIT EMPLOYEE MONEY ====");
		System.out.println("==== 16--WITHDRAW EMPLOYEE MONEY ====");
		System.out.println("==== 17--QUIT PROGRAM ====");
		System.out.println("");
	}
	
	public static void main(String args[]) {
		printInstruction();
		boolean quit = false;
		while (!quit) {
			System.out.println("FOR MORE INFORMATION, PRESS 0");
			System.out.print("USER COMMAND >>> ");
			int usrCmd = scanner.nextInt();
			scanner.nextLine();
			
			switch(usrCmd) {
			case 0:
				printInstruction();
				break;
			case 1:
				customerInfo.printCustomerInformation();
				break;
			case 2:
				customerInfo.addNewCustomer();
				break;
			case 3:
				customerInfo.updateCustomerInformation();
				break;
			case 4:
				customerInfo.removeCustomerInformation();
				break;
			case 5:
				customerInfo.findCustomerInformationByName();
				break;
			case 6:
				customerInfo.findCustomerInformationBySinNumber();
				break;
			case 7:
				customerInfo.depositCustomerMoney();
				break;
			case 8:
				customerInfo.withdrawCustomerMoney();
				break;
				
			case 9:
				fulltimeCibcEmployeeInfo.printEmployeeInformation();
				break;
			case 10:
				fulltimeCibcEmployeeInfo.addNewEmployee();
				break;
			case 11:
				fulltimeCibcEmployeeInfo.updateEmployeeInformation();
				break;
			case 12:
				fulltimeCibcEmployeeInfo.removeEmployeeInformation();
				break;
			case 13:
				fulltimeCibcEmployeeInfo.printEmployeeInformationByName();
				break;
			case 14:
				fulltimeCibcEmployeeInfo.printEmployeeInformationBySinNumber();
				break;
			case 15:
				fulltimeCibcEmployeeInfo.depositEmployeeMoney();
				break;
			case 16:
				fulltimeCibcEmployeeInfo.withdrawEmployeeMoney();
				break;
			case 17:
				System.out.println("SHUTTING DOWN SYSTEM ... ");
				quit = true;
				break;
			default:
				System.out.println("COMMAND NOT FOUND !!!");
				break;
			}
		}
	}
}
