package day_1;
 class Account{
	private int accountNo;
	private int accountBalance;
	private String accountPassword;
	private static String bankName="HDFC";
	
	Account(int accountNo,int accountBalance,String password){
		this.accountNo=accountNo;
		this.accountBalance=accountBalance;
		accountPassword=password;
		
	}
	
	void displayAccount() {
		System.out.println("Account Number    : "+ accountNo);
		System.out.println("Account Balance   : "+ accountBalance);
		System.out.println("Account Password  : "+ accountPassword);
		System.out.println("Bank Name         :"+bankName);
		System.out.println("=======================================");
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Banking......");
		Account ac1=new Account(111,40000,"Jack@123");
		ac1.displayAccount();
		Account ac2=new Account(222,50000,"James@123");
        ac2.displayAccount();
		Account ac3=new Account(333,60000,"Smith@123");
        ac3.displayAccount();
	}

}
