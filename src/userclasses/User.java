package userclasses;

/**
 *
 * @author OLYJOSH
 */
public class User {
    public static int userID;
    public static String dateCreated;
    public static String Password;
    public static double balance;
    public static String description;
    public static String user;
    
    public User(int userID,String user, String pass ,double balance, String dateCreated, String descr) {
        User.userID = userID;
        User.user=user;
        User.description= descr;
        User.dateCreated = dateCreated;
        User.balance = balance;
        User.Password= pass;
    }
    
    public User(){}

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        User.description = description;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        User.user = user;
    }


    public static int getUserID() {
        return userID;
    }

    public static void setUserID(int userID) {
        User.userID = userID;
    }

    public static String getDateCreated() {
        return dateCreated;
    }

    public static void setDateCreated(String dateCreated) {
        User.dateCreated = dateCreated;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        User.Password = Password;
    }

    public static double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    
}
