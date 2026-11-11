package decoratorPattern.pizzaShop.toppings;

import decoratorPattern.pizzaShop.pizzas.*;

public class ExtraPaneer extends Topping {

    BasePizza p;

    public ExtraPaneer(BasePizza p){
        this.p = p;
    }

    @Override 
    public float cost(){
        return this.p.cost() + 50;
    }
    
}
