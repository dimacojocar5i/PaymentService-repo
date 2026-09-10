package paymentApp.PaymentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private PaymentProcess paymentProcess;

    public PaymentController(PaymentProcess paymentProcess){
        this.paymentProcess = paymentProcess;
    }

    @GetMapping("/pay")
    public String makePayment() {

        return paymentProcess.ExecutePayment(230);
    }
}
