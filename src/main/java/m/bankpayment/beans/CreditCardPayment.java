package m.bankpayment.beans;

public class CreditCardPayment implements Ipayment {
	public CreditCardPayment() {
		System.out.println("CreditCardPayment::constructor");
	}

	public boolean processpayement(double billamount) {
		System.out.println("Creditcard payment success");
		return true;
	}

}
