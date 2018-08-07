package cibcEmployee;

import cibcConfigure.cibcConfig;

public class fulltimeCibcEmployee extends cibcEmployee{
	private double employeeType;
	private double workingHour;

	public fulltimeCibcEmployee(String employeeSinnumber, String employeeName, String employeeGender, int employeeAge,
			String employeeBackground, String employeeAddress, String employeeEmail, String employeePhoneNumber,
			String employeeAccountNumber, double employeeBalance, double employeePinCode, double employeeIncome) {
		super(employeeSinnumber, employeeName, employeeGender, employeeAge, employeeBackground, employeeAddress, employeeEmail,
				employeePhoneNumber, employeeAccountNumber, employeeBalance, employeePinCode, 0);		
	}
	
	public double getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(double empcibcfinancialmanager) {
		this.employeeType = empcibcfinancialmanager;
	}
	
	public double getWorkingHour() {
		return workingHour;
	}
	
	public void setWorkingHour(double workingHour) {
		this.workingHour = workingHour;
	}
	
	@Override
	public String findEmployeeIncomeAndOcc() {
		if (this.employeeType == cibcConfig.EMPCIBCFINANCIALMANAGER) {
			super.employeeIncome = cibcConfig.INCFINANCIALMANAGER + cibcConfig.INCEXTRAHOUR * this.workingHour;
			return "FINANCIAL MANAGER";
		}
		else if (this.employeeType == cibcConfig.EMPCIBCLOANOFFICER) {
			super.employeeIncome = cibcConfig.INCLOANOFFICER +cibcConfig.INCEXTRAHOUR * this.workingHour;
			return "LOAN OFFICER";
		}
		else if (this.employeeType == cibcConfig.EMPCIBCBANKTELLER) {
			super.employeeIncome = cibcConfig.INCBANKTELLER + cibcConfig.INCEXTRAHOUR * this.workingHour;
			return "BANK TELLER";
		}
		else if (this.employeeType == cibcConfig.EMPCIBCFINANCIALANALYST) {
			super.employeeIncome = cibcConfig.INCFINANCIALANALYST + cibcConfig.INCEXTRAHOUR * this.workingHour;
			return "FINANCIAL ANALYST";
		}
		else if (this.employeeType == cibcConfig.EMPCIBCITMAN) {
			super.employeeIncome = cibcConfig.INCITMAN + cibcConfig.INCEXTRAHOUR * this.workingHour;
			return "INFORMATION TECHNOLOGY MAN";
		}
		else if (this.employeeType == cibcConfig.EMPCIBCCLEANER) {
			super.employeeIncome = cibcConfig.INCCLEANER + cibcConfig.INCEXTRAHOUR * this.workingHour;
			return "CLEANER";
		}
		return null;
	}
	
	public void showFulltimeEmpInfo() {
		String employeeOcc = findEmployeeIncomeAndOcc();
		super.printEmployeeInformation();
		System.out.println("EMPLOYEE OCCUPATION: " + employeeOcc);
		System.out.println("");
	}
}












