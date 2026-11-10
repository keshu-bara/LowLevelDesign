package PaymentGateway.PaymentService;

import PaymentGateway.PaymentStratgy.*;


public class PayService {
    public Payment service;

    public void setService(Payment service){
        this.service = service;
    }

    public void makePayment(int amount){
        if(service == null){
            System.out.println("Select Service First");
            return ;
            
        }
        service.Pay(amount);
    }
    
}
