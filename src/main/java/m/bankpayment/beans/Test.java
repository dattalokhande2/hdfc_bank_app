package m.bankpayment.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class Test {
	public static void main(String[] args) {
		ApplicationContext Context=new ClassPathXmlApplicationContext("Beans.xml");
			
			PaymentService service = Context.getBean(PaymentService.class);
			service.doPayment(199.00);
			
 			}

}
