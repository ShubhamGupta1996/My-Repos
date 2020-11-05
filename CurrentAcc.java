package Lab_4;

public class CurrentAcc extends AccDetails {
	public double overdraftlimit;
	public void withdraw(double w) {
		overdraftlimit=500;
		if (getBalance()-w > overdraftlimit)
		{
			System.out.println("TRUE");
			setBalance(getBalance()-w);
		}
		else
		{
			System.out.println("FALSE");
		}
		
	}
}
