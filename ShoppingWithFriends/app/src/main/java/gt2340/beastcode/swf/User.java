package gt2340.beastcode.swf;

import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represent the base user
 * or primary actor
 * of the application
 * @author Srijan Sood
 * @version 1.0
 */
public class User extends ParseUser {
    //private ParseUser p;
    private int uid;
    private String uname;
    private List<User> friendList;

    public User() {
       //ParseUser() called through super();
        uname = this.getUsername();
        uid = this.hashCode();
        friendList = new ArrayList<>();
    }



}
