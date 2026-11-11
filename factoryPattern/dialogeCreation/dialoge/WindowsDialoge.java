package factoryPattern.dialogeCreation.dialoge;

import factoryPattern.dialogeCreation.button.*;

public class WindowsDialoge extends Dialoge{

    @Override 
    public Button createButton(){
        return new WindowsButton();
    }

}
