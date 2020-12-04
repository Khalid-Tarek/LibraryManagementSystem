package librarymanagementsystem.Users;

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
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        
        str.append("Name: ").append(NAME).append("\n");
        str.append("Username: ").append(USERNAME).append("\n");
        str.append("UserID: ").append(USER_ID);
        
        return str.toString();
    }
}