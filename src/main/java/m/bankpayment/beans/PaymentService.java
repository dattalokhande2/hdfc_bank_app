package m.bankpayment.beans;

public class PaymentService {
	private Ipayment payment;
	public PaymentService(){
		System.out.println("PaymentService::0-Constructor");
	
	}
		public PaymentService(Ipayment payment) {
			System.out.println("PaymentService::parameterised-Constructor");
		this.payment=payment;
	}
	
	public void doPayment(double billAmount)
	{
		boolean status = payment.processpayement(billAmount);
		if(status)
		{
			System.out.println("Reciept printing....");
			
		}
		else {
			System.out.println("Card declined");
		}
			
		
	}
	public void setPayment(Ipayment payment)
	{
		this.payment=payment;
	}

}
