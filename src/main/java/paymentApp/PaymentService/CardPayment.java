package paymentApp.PaymentService;

import org.springframework.stereotype.Service;

@Service("cardPaymentService")
public class CardPayment implements PaymentService{
    @Override
    public String payment(double summ) {
        return "Achitarea cu card este cu SUCCES! " + summ + "Lei";
    }
}

