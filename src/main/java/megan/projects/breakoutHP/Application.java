package megan.projects.breakoutHP;

import megan.projects.breakoutHP.Room.Room;
import megan.projects.breakoutHP.Sprites.MagicObject;
import megan.projects.breakoutHP.Sprites.SortingHat;
import megan.projects.breakoutHP.View.BasicUI;
import megan.projects.breakoutHP.View.MenuDrivenCLI;

public class Application {
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Explore the Room";
    private static final String MAIN_MENU_OBJECT_1 = "Sorting Hat";
    private static final String MAIN_MENU_OBJECT_2 = "Object 2";
    private static final String MAIN_MENU_OBJECT_3 = "Object 3";
    private static final String MAIN_MENU_OBJECT_4 = "Object 4";
    private static final String MAIN_MENU_OBJECT_5 = "Object 5";
    private static final String MAIN_MENU_OPTIONS_CHECK_LIVES = "Check Lives";
    private static final String MAIN_MENU_OPTIONS_CHECK_PROGRESS = "Check Progress";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OBJECT_1, MAIN_MENU_OBJECT_2, MAIN_MENU_OBJECT_3,
                                  MAIN_MENU_OBJECT_4, MAIN_MENU_OBJECT_5, MAIN_MENU_OPTIONS_CHECK_LIVES, MAIN_MENU_OPTIONS_CHECK_PROGRESS};

    private static final String SUBMENU_OPTIONS_ENTER_GUESS = "Enter Guess";
    private static final String SUBMENU_OPTIONS_GET_HINT = "Get Hint";
    private static final String SUBMENU_OPTIONS_BACK_T0_ROOM = "Back to Room";
    private static final String[] SUBMENU_OPTIONS = {SUBMENU_OPTIONS_ENTER_GUESS, SUBMENU_OPTIONS_GET_HINT, SUBMENU_OPTIONS_BACK_T0_ROOM};

    //instantiate room with any objects you choose. must declare UI as well. Initialized by constructor.

    private final BasicUI ui;
    private final Room newRoom = new Room(new SortingHat(), new SortingHat(), new SortingHat(), new SortingHat(), new SortingHat());

    public Application(BasicUI ui) {
        this.ui = ui;
    }

    public static void main(String[] args) {
        BasicUI cli = new MenuDrivenCLI();
        Application application = new Application(cli);
        application.run();
    }

    //room main menu
    public void run() {
        boolean finished = false;
        while (!finished) {
            ui.output("Welcome to the breakout room. \nI am both your captor and your host! \nExplore the items within my bounds " +
                    "and solve their riddles to gather keys. \nFind all 5 keys and I'll let you out. \nBut beware, too many wrong guesses will be game over. " +
                    "\n\n ****Select a Number Below to Start Exploring*****");

            String selection = ui.promptForSelection(MAIN_MENU_OPTIONS);

            if (selection.equals(MAIN_MENU_OBJECT_1)) {
                handleObject(newRoom.getObject1());
            } else if (selection.equals(MAIN_MENU_OBJECT_2)) {
                handleObject(newRoom.getObject2());
            } else if (selection.equals(MAIN_MENU_OBJECT_3)) {
                handleObject(newRoom.getObject3());
            } else if (selection.equals(MAIN_MENU_OBJECT_4)) {
                handleObject(newRoom.getObject4());
            } else if (selection.equals(MAIN_MENU_OBJECT_5)) {
                handleObject(newRoom.getObject5());
            } else if (selection.equals(MAIN_MENU_OPTIONS_CHECK_LIVES)) {
                ui.output("You have " + newRoom.getPlayer1().getLivesString() + " lives remaining. Be careful!");
                ui.pauseOutput();
            } else if (selection.equals(MAIN_MENU_OPTIONS_CHECK_PROGRESS)) {
                ui.output("You have collected " + newRoom.getPlayer1().getKeyCountString()+ "keys.\n Continue exploring to find all 5 keys!");
                ui.pauseOutput();

            }
        }
    }

        //Magical Object Submenu
        private void handleObject (MagicObject myMagicalObject){

            ui.output(newRoom.objectInfo(myMagicalObject));
            ui.pauseOutput();

            boolean done = false;
            while (!done) {
                String selection = ui.promptForSelection(SUBMENU_OPTIONS);

                if (selection.equals(SUBMENU_OPTIONS_ENTER_GUESS)) {
                    ui.output("Can you solve my riddle? Enter your guess.");
                    selection = ui.promptForString();
                    if (newRoom.riddleSolved(selection, myMagicalObject) && newRoom.getPlayer1().getKeyCountInt() == 4) {
                        ui.output("You are correct, and you have bested me at my own game. You have broken out!");
                        System.exit(0);
                    }else if (newRoom.riddleSolved(selection, myMagicalObject)) {
                        newRoom.getPlayer1().foundKey();
                        ui.output("You are correct. I award you one key.");
                        done = true;
                    }else {
                        newRoom.getPlayer1().loseALife();
                        ui.output("You have lost a life.");
                        if (newRoom.getPlayer1().outOfLives()) {
                            ui.output("You are now out of lives.\nGame Over.");
                            System.exit(0);
                        } else {
                            ui.output("Perhaps you require a hint? Or guess again if you are so bold.");
                        }
                    }
                } else if (selection.equals(SUBMENU_OPTIONS_GET_HINT)) {
                    ui.output(newRoom.objectHint(myMagicalObject));
                } else if (selection.equals(SUBMENU_OPTIONS_BACK_T0_ROOM)) {
                    done = true;
                }
            }
        }
    }
