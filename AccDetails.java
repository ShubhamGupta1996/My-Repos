package Lab_4;

public class AccDetails 
{
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double d) {
		this.balance=balance + d;
	}
	public void withdraw(double w) {
		if (this.balance-w >500)
		{
			this.balance=balance-w;
		}
		else
		{
			System.out.println("Insufficient Balance to Withdraw.");
		}
	}
	
	public String toString()
	{
		return (accHolder.getName()+"\t"+accHolder.getAge()+"\t"+ accNum +"\t"+ balance);
	}
	

}
