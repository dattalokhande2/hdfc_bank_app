package m.bankpayment.beans;

public class SodexPayment implements Ipayment {
	
		public SodexPayment()
		{
			System.out.println("SodexPayment::constructor");
		}

	public boolean processpayement(double billamount) {
		System.out.println("Sodex payment Succes   s");
			return true;
	}

}
