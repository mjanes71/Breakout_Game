package megan.projects.breakoutHP.View;

import java.math.BigDecimal;

public interface BasicUI {

        void output(String content);

        void pauseOutput();

        String promptForSelection(String[] options);

        String promptForString();

}
