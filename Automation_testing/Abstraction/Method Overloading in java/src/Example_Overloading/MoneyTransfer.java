package Example_Overloading;

public class MoneyTransfer {
		public void transfer(double amount) {
		System.out.println("Transfered Amount: " + amount);
}
		public void transfer(double amount, String accountNumber) {
		System.out.println("tansferred"  + amount + " to Account: " + accountNumber );
		}
		public void transfer(double amount, String accountNumber, String remarks) {
			System.out.println("Transferred " + amount);
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Remarks: " + remarks);
		}
	
		public static void main(String[] args) {
		MoneyTransfer mt = new MoneyTransfer();
		mt.transfer(1000);
		mt.transfer(5000, "SBIN12345");
		mt.transfer(10000, "327211974", "House Rent");
	}

}
