package com.cg.framework;

public abstract class BankAcc
{
	private int accNo;
	private String accNm;
	private float accBal;

	public BankAcc(int accNo, String accNm, float accBal)
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public void withdraw(float accBal)
	{
		System.out.println("Account balance available:"+accBal);
	}
	public void deposit(float accBal)
	{
		System.out.println("Available Balance after depositing:"+accBal);
	}
	
	public int getAccNo()
	{
		return accNo;
	}

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}

	public String getAccNm() 
	{
		return accNm;
	}

	public void setAccNm(String accNm)
	{
		this.accNm = accNm;
	}

	public float getAccBal() 
	{
		return accBal;
	}

	public void setAccBal(float accBal)
	{
		this.accBal = accBal;
	}
	
	@Override
	public String toString()
	{
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
