package org.jsadaoui.demo.payment;

import org.springframework.stereotype.Component;

@Component
@CreditCard @Visa
public class VisaPaymentService implements PaymentService {

	@Override
	public String toString() {
		return "visa";
	}
}
