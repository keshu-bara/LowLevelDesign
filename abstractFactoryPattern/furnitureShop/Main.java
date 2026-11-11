package abstractFactoryPattern.furnitureShop;

import abstractFactoryPattern.furnitureShop.furnitureFactory.*;
import abstractFactoryPattern.furnitureShop.furtniture.*;

public class Main {
    public static void main(String[] args) {
        testFurnitureFactory(new ModernFactory());
        testFurnitureFactory(new VictorianFactory());
    }

    private static void testFurnitureFactory(Factory factory) {
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.describe();
        table.describe();

        System.out.println("----------------");
    }
}