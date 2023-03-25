package m.bankpayment.beans;

public class DebitCardPayment implements Ipayment{
	public DebitCardPayment()
	{
		System.out.println("DebitCardPayment ::Constructor");
	}

	public boolean processpayement(double billamount) {
	System.out.println("Debitcard payment Success");
		return true;
	}
	
	

}
