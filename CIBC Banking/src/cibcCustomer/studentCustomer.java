package cibcCustomer;

public class studentCustomer extends cibcCustomer{

	public studentCustomer(String customerSinnumber, String customerName, String customerGender, int customerAge,
			String customerBackground, String customerAddress, String customerEmail, String customerPhoneNumber,
			String customerAccountNumber, double customerBalance, double customerPinCode) {
		super(customerSinnumber, customerName, customerGender, customerAge, customerBackground, customerAddress, customerEmail,
				customerPhoneNumber, customerAccountNumber, customerBalance, customerPinCode);
	}
	
	@Override
	public void printCustomerInformation() {
		super.printCustomerInformation();
		System.out.println("====CUSTOMER BANKING CARD: DEBIT CARD");
		System.out.println("");
	}
}

