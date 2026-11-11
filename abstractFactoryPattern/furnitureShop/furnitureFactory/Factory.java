package abstractFactoryPattern.furnitureShop.furnitureFactory;

import abstractFactoryPattern.furnitureShop.furtniture.*;

public interface Factory {
    
    public Table createTable();
    public Chair createChair();

}
