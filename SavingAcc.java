package Lab_4;

public class SavingAcc extends AccDetails
{
	
	    public final double min_balance=500;
		public void withdraw(double c) {
			
			if (getBalance()-c >min_balance)
			{   
				System.out.println("Method Overriden");
				setBalance(getBalance()-c);
			}
			else
			{
				System.out.println("Overriden: Insufficient Balance to Withdraw. Rs. "+min_balance +" require after withdraw");
			}
         }
}
