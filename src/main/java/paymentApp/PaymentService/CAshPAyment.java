package paymentApp.PaymentService;


import org.springframework.stereotype.Service;

@Service("cashPaymentService")
public class CAshPAyment implements PaymentService{
    @Override
    public String payment(double summ) {
        return "Plata CAsh a fost procesata! " + summ + "Lei";
    }
}
