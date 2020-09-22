package com.programm;

public class BankExample {

	int accNo;
	String name;
	float amount;

	public  void insert(int i,String j,float k)
	{
		accNo=i;
		name=j;
		amount=k;
	}

	public void deposit(float k)
	{
		amount=amount+k;
		System.out.println("Amount is deposited is:"+k);

	}

	public void withdrawal(float k)
	{
		if(amount<k)
		{
			System.out.println("Insuffients balance");
		}
		else
		{
			amount=amount-k;
			System.out.println("withdraw amount is:"+k);
		}
	}

	public void checkBalance()
	{
		System.out.println("Total balance is :"+amount);
	}


	public static void main(String[] args) {

		BankExample b1=new BankExample();
		BankExample b2=new BankExample();

		b1.insert(1234, "vipul", 10000);
		b2.insert(2345, "Raj", 2000);

		b1.checkBalance();
		b1.deposit(2000);
		b1.withdrawal(5000);
		b1.checkBalance();

		b2.checkBalance();
		b2.deposit(5000);
		b2.withdrawal(1000);
		b2.checkBalance();
	}

}
