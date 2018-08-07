package cibcCustomer;

public class vipCustomer extends cibcCustomer{

	public vipCustomer(String customerSinnumber, String customerName, String customerGender, int customerAge,
			String customerBackground, String customerAddress, String customerEmail, String customerPhoneNumber,
			String customerAccountNumber, double customerBalance, double customerPinCode) {
		super(customerSinnumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail,
				customerPhoneNumber, customerAccountNumber, customerBalance, customerPinCode);
	}

	@Override
	public void printCustomerInformation() {
		super.printCustomerInformation();
		System.out.println("====CUSTOMER BANKING CARD: CREDIT CARD");
		System.out.println("");
	}
}

