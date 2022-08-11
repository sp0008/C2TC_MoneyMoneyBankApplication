package com.cg.client;

import com.cg.bankapplication.*;
import com.cg.framework.*;

public class Client {
public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(234567,"ISHA",100000,true);
		CurrentAcc ca=new MMCurrentAcc(32456,"Shiva",250000,5000);
		sa.withdraw(sa.getAccBal());
		ca.withdraw(ca.getCreditLimit());
	}

}
