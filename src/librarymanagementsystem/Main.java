package librarymanagementsystem;

import librarymanagementsystem.GUI.*;

/**
 *
 * @author The RAD Squad
 */
public class Main {

    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
        loginScreen.setTitle("Library Management System");
        loginScreen.setLocationRelativeTo(null);
    }
}
