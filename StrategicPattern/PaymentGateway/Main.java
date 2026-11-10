package PaymentGateway;

import PaymentGateway.PaymentService.PayService;
import PaymentGateway.PaymentStratgy.*;


class Main{

    public static void main(String[] args) {

        PayService service = new PayService();

        service.setService(new Upi());
        service.makePayment(5000);

        service.setService(new CreditCard());
        service.makePayment(10000);

        service.setService(new PayPalPay());
        service.makePayment(10000);


        

    }
}