package cibcConfigure;

public class cibcConfig {
	// Type of banking account at CIBC bank
	public static final double VIPACCOUNT = 1;
	public static final double BUSINESSACCOUNT = 2;
	public static final double STUDENTACCOUNT = 3;
	
	// Type of banking card
	public static final double DEBITCARD = 4;
	public static final double CREDITCARD = 5;
	
	// Limitation applied for credit card
	public static final double VIPLIMITATION = 100000;
	public static final double BUSINESSLIMITATION = 50000;
	
	// Limitation applied for debit account
	public static final double STUDENTLIMITATION = 2000;
	
	// Service fees
	// Transfer the money inside the country will cost 10$ with the money less than 5000
	// Transfer the money inside the country will cost 20$ with the money greater than 5000 and smaller than 10000
	// Transfer the money inside the country will cost 50$ with the money greater than 10000$
	// Transfer the money outside the country will cost 100$ with any amount of money greater than 100$
	public static final double SERVICETRANSFERMONEYLEVELONE = 10;
	public static final double SERVICETRANSFERMONEYLEVELTWO = 20;
	public static final double SERVICETRANSFERMONEYLEVELTHREE = 50;
	public static final double SERVICETRANSFERMONEYLEVELFOUR = 100;
	
	// CIBC employees
	public static final double EMPCIBCFINANCIALMANAGER = 6;
	public static final double EMPCIBCLOANOFFICER = 7;
	public static final double EMPCIBCBANKTELLER = 8;
	public static final double EMPCIBCFINANCIALANALYST = 9;
	public static final double EMPCIBCITMAN = 10;
	public static final double EMPCIBCCLEANER = 11;
	
	// CIBC employee income per month
	public static final double INCFINANCIALMANAGER = 50000;
	public static final double INCLOANOFFICER = 10000;
	public static final double INCBANKTELLER = 8000;
	public static final double INCFINANCIALANALYST = 20000;
	public static final double INCITMAN = 30000;
	public static final double INCCLEANER = 5000;
	public static final double INCEXTRAHOUR = 50;
}
