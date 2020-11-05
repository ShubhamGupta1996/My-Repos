package Lab_4;

public class TestAcc 
{   
	public static void main(String[] args)
	{
		Double ac=Math.random();
		String str=ac.toString();
		String acno=str.substring(3);
		long ac_id=Long.parseLong(acno);
		
		AccDetails acc = new AccDetails();
		
		acc.setAccNum(ac_id);
		acc.setBalance(3000);            // initilizing Kathy acc with 3000
		Person p=new Person();
		p.setName("Kathy");
		p.setAge(32);
		acc.setAccHolder(p);
		System.out.println(acc);
		
		acc.withdraw(2000);             // withdrawing 2000 from kathy acc
		System.out.println("After Withdraw from kathy ");
		System.out.println(acc);
		
		AccDetails acc1=new AccDetails();
		Double d1= Math.random();             
		String str1= d1.toString();            
		String accnum1=str1.substring(3);      
		Long id1= Long.parseLong(accnum1);      
		acc1.setAccNum(id1);
		
		acc1.setBalance(2000);               // initilizing Smith acc with 2000
		Person p1=new Person();
		p1.setName("Smith");
		p1.setAge(23);
		acc1.setAccHolder(p1);
		System.out.println(acc1);
		
		acc1.deposit(2000);                   // depositing 2000 in Smith acc
		System.out.println("After 2000 deposited for Smith");
		System.out.println(acc1);
		
		//2nd part a
		
		SavingAcc s=new SavingAcc();    // Creating object for saving account
		Double d2= Math.random();             
		String str2= d2.toString();            
		String accnum2=str2.substring(3);      
		Long id2= Long.parseLong(accnum2);      
		s.setAccNum(id2);                  
		
		s.setBalance(9000);
		Person p2=new Person();         // Creating Person object for name and age
		p2.setName("Shubham");
		p2.setAge(24);
		s.setAccHolder(p2);
		System.out.println(s);
		s.withdraw(2600);
		System.out.println("After Withdraw from Shubham ");
		System.out.println(s);
		
		//2nd part b
		
		CurrentAcc c=new CurrentAcc();
		Double d3= Math.random();             //Taking random number bet 0 and 1
		String str3= d3.toString();            //converting it to string
		String accnum3=str3.substring(3);      //Taking digits after decimal
		Long id3= Long.parseLong(accnum3);      // converting string to long
		c.setAccNum(id3);  
		
		c.setBalance(5000);
		Person p3=new Person();         // Creating Person object for name and age
		p3.setName("Shubham");
		p3.setAge(24);
		c.setAccHolder(p3);
		System.out.println(c);
		
		c.withdraw(4900);
		System.out.println("After deduction in Shubham's acc ");
		System.out.println(c);
		
		
		
	}

}
