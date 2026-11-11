package abstractFactoryPattern.furnitureShop.furnitureFactory;

import abstractFactoryPattern.furnitureShop.furtniture.*;


public class ModernFactory implements Factory {


    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override 
    public Table createTable(){
        return new ModernTable();
    }
}