package megan.projects.breakoutHP;

import megan.projects.breakoutHP.View.BasicUI;
import megan.projects.breakoutHP.View.MenuDrivenCLI;

public class Application {
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String MAIN_MENU_OPTION_SALES_REPORT = "Sales Report";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT, MAIN_MENU_OPTION_SALES_REPORT};

    private static final String SUBMENU_OPTIONS_FEED_MONEY = "Feed Money";
    private static final String SUBMENU_OPTIONS_SELECT_PRODUCT = "Select Product";
    private static final String SUBMENU_OPTIONS_FINISH_TRANSACTION = "Finish Transaction";
    private static final String[] SUBMENU_OPTIONS = {SUBMENU_OPTIONS_FEED_MONEY, SUBMENU_OPTIONS_SELECT_PRODUCT, SUBMENU_OPTIONS_FINISH_TRANSACTION};

    // our instance of vending machine

    private final BasicUI ui;

    public Application(BasicUI ui) {
        this.ui = ui;
    }

    public static void main(String[] args) {
        BasicUI cli = new MenuDrivenCLI();
        Application application = new Application(cli);
        application.run();
    }

    //vendng machine main menu
    public void run() {
        boolean finished = false;
        while (!finished) {
            String selection = ui.promptForSelection(MAIN_MENU_OPTIONS);

            if (selection.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                ui.pauseOutput();
            } else if (selection.equals(MAIN_MENU_OPTION_PURCHASE)) {
                handlePurchaseMenu();
            } else if (selection.equals(MAIN_MENU_OPTION_EXIT)) {
                finished = true;
            } else if (selection.equals(MAIN_MENU_OPTION_SALES_REPORT)) {
            }
        }
    }

    //vending machine purchase menu
    private void handlePurchaseMenu() {
        String selection = ui.promptForSelection(SUBMENU_OPTIONS);
        boolean done = false;

        while (!done) {
            if (selection.equals(SUBMENU_OPTIONS_FEED_MONEY)) {
                selection = ui.promptForSelection(SUBMENU_OPTIONS);
            } else if (selection.equals(SUBMENU_OPTIONS_SELECT_PRODUCT)) {
                selection = ui.promptForSelection(SUBMENU_OPTIONS);
            } else if (selection.equals(SUBMENU_OPTIONS_FINISH_TRANSACTION)) {
                done = true;
            }
        }
    }


}
