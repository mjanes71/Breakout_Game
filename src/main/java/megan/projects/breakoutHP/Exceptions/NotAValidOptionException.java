package megan.projects.breakoutHP.Exceptions;

import megan.projects.breakoutHP.View.BasicUI;
import megan.projects.breakoutHP.View.MenuDrivenCLI;

public class NotAValidOptionException extends Exception {

    private BasicUI ui = new MenuDrivenCLI();

    public void NotValid(){
        ui.output("Please choose a valid option.");
    }

}
