package paymentApp.PaymentService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcess {

    private final PaymentService paymentService;

    public PaymentProcess(@Qualifier("cardPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;

    }

    public String ExecutePayment(double summ) {
        return paymentService.payment(summ);
    }

}