package PaymentGateway.PaymentStratgy;



public class Upi implements Payment{

    @Override 
    public void Pay(int amount){
        System.out.println("Payed " + amount + "using UPI.");
    } 

}