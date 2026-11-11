package decoratorPattern.pizzaShop;

import decoratorPattern.pizzaShop.pizzas.*;
import decoratorPattern.pizzaShop.toppings.*;

public class Main {
    public static void main(String[] args) {

        BasePizza p = new Margerita();
        System.out.println(p.cost());

        System.out.println((new ExtraChess(new ExtraPaneer(p))).cost());

        p = new VegDeilight();
        System.out.println(p.cost());

        System.out.println((new ExtraPaneer(p)).cost());


        
    }
}
