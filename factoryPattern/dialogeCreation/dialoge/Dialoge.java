package factoryPattern.dialogeCreation.dialoge;

import factoryPattern.dialogeCreation.button.*;


public abstract class Dialoge {
    
    public abstract Button createButton();

    public void render(){
        Button b = createButton();
        b.render();
    }

}



