package abstractFactoryPattern.furnitureShop.furnitureFactory;

import abstractFactoryPattern.furnitureShop.furtniture.*;


public class VictorianFactory implements Factory {

    @Override 
    public Chair createChair(){
        return new VictorianChair();
    }

    @Override 
    public Table createTable(){
        return new VictorianTable();
    }
    
}
