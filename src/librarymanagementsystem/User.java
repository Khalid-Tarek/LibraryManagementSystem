package librarymanagementsystem;

/**
 * 
 * @author Abdallah Kareem
 */
public abstract class User {
    final private String USERNAME;
    final private int USER_ID;
    final private String NAME;

    protected User(String USERNAME, int USER_ID, String NAME) {
        this.USERNAME = USERNAME;
        this.USER_ID = USER_ID;
        this.NAME = NAME;
    }


    public String getUSERNAME() {
        return USERNAME;
    }


    public int getUSER_ID() {
        return USER_ID;
    }

    public String getNAME() {
        return NAME;
    }
}