package paymentGateway.PaymentStratgy;


public class CreditCard implements Payment{

    @Override 
    public void Pay(int amount){
        System.out.println("Payed " + amount + "using CreditCard.");
    }
    


}