package decoratorPattern.pizzaShop.toppings;

import decoratorPattern.pizzaShop.pizzas.*;


public class ExtraChess extends Topping{

    BasePizza p;

    public ExtraChess(BasePizza p){
        this.p = p;
    }
    
    @Override 
    public float cost(){
        return this.p.cost() + 25;
    }

}


