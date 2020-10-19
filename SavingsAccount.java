package classes;

public class SavingsAccount {

	public String name;
	public double balance;
	
	public void deposit(double x){
		if(x <= 0){
			System.out.println("The sum to withdraw"
					+ " should be a positive number");
			return;
		}
		
		balance+=x;
	}
	
	public void withdraw(double x){
		if(balance < x){
			System.out.println("The sum to withdraw is too high");
			return;
		}
		else if (x<=0){
			System.out.println("The sum to deposit"
					+ " should be a positive number");
			return;
		}
		
		balance-=x;
		
	}

}
