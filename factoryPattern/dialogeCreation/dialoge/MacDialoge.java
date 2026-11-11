package factoryPattern.dialogeCreation.dialoge;

import factoryPattern.dialogeCreation.button.*;

public class MacDialoge extends Dialoge {

    @Override 
    public Button createButton(){
        return new MacButton();
    }
    
}
