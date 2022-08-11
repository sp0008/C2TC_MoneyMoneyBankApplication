package com.cg.bankapplication;

import com.cg.framework.*;

public class MMBankFactory extends BankFactory 
{
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		MMSavingAcc sa=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit)
	{
		MMCurrentAcc ca=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return ca;
	}
}

	

