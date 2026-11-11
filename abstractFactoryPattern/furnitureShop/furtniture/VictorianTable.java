package abstractFactoryPattern.furnitureShop.furtniture;

public class VictorianTable implements Table {
    
    @Override 
    public void describe(){
        System.out.println("This is a Victorian table");
    }
}
