package paymentGateway.PaymentStratgy;


public class PayPalPay implements Payment{

    @Override 
    public void Pay(int amount){
        System.out.println("Payed " + amount + "using PayPalPay.");
    }
    
}