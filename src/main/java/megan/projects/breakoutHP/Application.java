package megan.projects.breakoutHP;

import megan.projects.breakoutHP.Room.Room;
import megan.projects.breakoutHP.Sprites.*;
import megan.projects.breakoutHP.View.BasicUI;
import megan.projects.breakoutHP.View.MenuDrivenCLI;

public class Application {
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Explore the Room";
    private static final String MAIN_MENU_OBJECT_1 = "Sorting Hat";
    private static final String MAIN_MENU_OBJECT_2 = "Numbus 3000 Broomstick";
    private static final String MAIN_MENU_OBJECT_3 = "Wand";
    private static final String MAIN_MENU_OBJECT_4 = "Magical Creature";
    private static final String MAIN_MENU_OBJECT_5 = "Potion";
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
    private final Room newRoom = new Room(new SortingHat(), new Broom(), new Wand(), new MagicalCreature(), new Potion());

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
        ui.output("\u001b[31m" + "                                                                                                                     \n" +
                "88888888ba   88888888ba   88888888888         db         88      a8P        ,ad8888ba,    88        88  888888888888  \n" +
                "88      \"8b  88      \"8b  88                 d88b        88    ,88'        d8\"'    `\"8b   88        88       88       \n" +
                "88      ,8P  88      ,8P  88                d8'`8b       88  ,88\"         d8'        `8b  88        88       88       \n" +
                "88aaaaaa8P'  88aaaaaa8P'  88aaaaa          d8'  `8b      88,d88'          88          88  88        88       88       \n" +
                "88\"\"\"\"\"\"8b,  88\"\"\"\"88'    88\"\"\"\"\"         d8YaaaaY8b     8888\"88,         88          88  88        88       88       \n" +
                "88      `8b  88    `8b    88             d8\"\"\"\"\"\"\"\"8b    88P   Y8b        Y8,        ,8P  88        88       88       \n" +
                "88      a8P  88     `8b   88            d8'        `8b   88     \"88,       Y8a.    .a8P   Y8a.    .a8P       88       \n" +
                "88888888P\"   88      `8b  88888888888  d8'          `8b  88       Y8b       `\"Y8888Y\"'     `\"Y8888Y\"'        88       \n" +
                "                                                                                                                      \n" +
                "                                                                                                                   " + "\u001b[0m");

        ui.output("\u001b[34m" + "__          ___                  _ _              __          __        _     _   ______    _ _ _   _             \n" +
                " \\ \\        / (_)                | (_)             \\ \\        / /       | |   | | |  ____|  | (_) | (_)            \n" +
                "  \\ \\  /\\  / / _ ______ _ _ __ __| |_ _ __   __ _   \\ \\  /\\  / /__  _ __| | __| | | |__   __| |_| |_ _  ___  _ __  \n" +
                "   \\ \\/  \\/ / | |_  / _` | '__/ _` | | '_ \\ / _` |   \\ \\/  \\/ / _ \\| '__| |/ _` | |  __| / _` | | __| |/ _ \\| '_ \\ \n" +
                "    \\  /\\  /  | |/ / (_| | | | (_| | | | | | (_| |    \\  /\\  / (_) | |  | | (_| | | |___| (_| | | |_| | (_) | | | |\n" +
                "     \\/  \\/   |_/___\\__,_|_|  \\__,_|_|_| |_|\\__, |     \\/  \\/ \\___/|_|  |_|\\__,_| |______\\__,_|_|\\__|_|\\___/|_| |_|\n" +
                "                                             __/ |                                                                 \n" +
                "                                            |___/                                                                 " + "\u001b[0m");
        ui.output("Welcome to the breakout room. \nI am both your captor and your host! \nExplore the items within my bounds " +
                "and solve their riddles to gather keys. \nFind all 5 keys and I'll let you out. \nBut beware, too many wrong guesses will be game over.");
        boolean finished = false;
        while (!finished) {
                ui.output("\033[0;1m" + "****Select a Number Below to Start Exploring*****" + "\u001b[0m");

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
                ui.output("\u001b[34m" + "You have " + newRoom.getPlayer1().getLivesString() + " lives remaining. Be careful!"+ "\u001b[0m");
            } else if (selection.equals(MAIN_MENU_OPTIONS_CHECK_PROGRESS)) {
                ui.output("\u001b[34m" + "You have collected " + newRoom.getPlayer1().getKeyCountString()+ " keys.\nContinue exploring to find all 5 keys!"+ "\u001b[0m");

            }
        }
    }

        //Magical Object Submenu
        private void handleObject (MagicObject myMagicalObject){

            ui.output(newRoom.objectInfo(myMagicalObject));

            boolean done = false;
            while (!done) {
                String selection = ui.promptForSelection(SUBMENU_OPTIONS);

                if (selection.equals(SUBMENU_OPTIONS_ENTER_GUESS)) {
                    ui.output("\033[0;1m" + "Can you solve my riddle? Enter your guess."+ "\u001b[0m");
                    selection = ui.promptForString();
                    if (newRoom.riddleSolved(selection, myMagicalObject) && newRoom.getPlayer1().getKeyCountInt() == 4) {
                        ui.output("\033[0;1m" + newRoom.getObjectAction(myMagicalObject) + " You are correct, and you have bested me at my own game. " +
                                "\n_  _____________  __   _____________________________ ___________   ____________  _________\n" +
                                "_ \\/ /_  __ \\_  / / /   ___  __ )__  __ \\_  __ \\__  //_/__  ____/   __  __ \\_  / / /__  __/\n" +
                                "__  /_  / / /  / / /    __  __  |_  /_/ /  / / /_  ,<  __  __/      _  / / /  / / /__  /   \n" +
                                "_  / / /_/ // /_/ /     _  /_/ /_  _, _// /_/ /_  /| | _  /___      / /_/ // /_/ / _  /    \n" +
                                "/_/  \\____/ \\____/      /_____/ /_/ |_| \\____/ /_/ |_| /_____/      \\____/ \\____/  /_/     \n" +
                                "                                                                                           " + "\n You escaped this time, bring me a friend who you think is worthy.");
                        System.exit(0);
                    }else if (newRoom.riddleSolved(selection, myMagicalObject)) {
                        newRoom.getPlayer1().foundKey();
                        ui.output("\u001b[35m" + "You are correct! " + newRoom.getObjectAction(myMagicalObject) + " You have found 1 Key." + "\n\n" +
                                "     8 8 8 8                     ,ooo.\n" +
                                "     8a8 8a8                    oP   ?b\n" +
                                "    d888a888zzzzzzzzzzzzzzzzzzzz8     8b\n" +
                                "     `\"\"^\"\"'                    ?o___oP'");
                        done = true;
                    }else {
                        newRoom.getPlayer1().loseALife();
                        ui.output("You have lost a life.");
                        if (newRoom.getPlayer1().outOfLives()) {
                            ui.output("You are now out of lives." + "\u001b[31m" +
                                    "\n .----------------.  .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------. \n" +
                                    "| .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                                    "| |    ______    | || |      __      | || | ____    ____ | || |  _________   | | | |     ____     | || | ____   ____  | || |  _________   | || |  _______     | |\n" +
                                    "| |  .' ___  |   | || |     /  \\     | || ||_   \\  /   _|| || | |_   ___  |  | | | |   .'    `.   | || ||_  _| |_  _| | || | |_   ___  |  | || | |_   __ \\    | |\n" +
                                    "| | / .'   \\_|   | || |    / /\\ \\    | || |  |   \\/   |  | || |   | |_  \\_|  | | | |  /  .--.  \\  | || |  \\ \\   / /   | || |   | |_  \\_|  | || |   | |__) |   | |\n" +
                                    "| | | |    ____  | || |   / ____ \\   | || |  | |\\  /| |  | || |   |  _|  _   | | | |  | |    | |  | || |   \\ \\ / /    | || |   |  _|  _   | || |   |  __ /    | |\n" +
                                    "| | \\ `.___]  _| | || | _/ /    \\ \\_ | || | _| |_\\/_| |_ | || |  _| |___/ |  | | | |  \\  `--'  /  | || |    \\ ' /     | || |  _| |___/ |  | || |  _| |  \\ \\_  | |\n" +
                                    "| |  `._____.'   | || ||____|  |____|| || ||_____||_____|| || | |_________|  | | | |   `.____.'   | || |     \\_/      | || | |_________|  | || | |____| |___| | |\n" +
                                    "| |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | |\n" +
                                    "| '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                                    " '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------' ");
                            System.exit(0);
                        } else {
                            ui.output("\033[0;1m" + "Perhaps you require a hint? Or guess again if you are so bold." + "\u001b[0m");
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
