package com.cg.framework;

public class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	private static final  float MINBAL=100;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Remaining balace after withdrawal :"+accBal);	
	}
	
	public boolean isSalaried() 
	{
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried)
	{
		this.isSalaried = isSalaried;
	}
	public static float getMinbal() 
	{
		return MINBAL;
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
