package gt2340.beastcode.swf;

import com.parse.ParseUser;

import java.util.List;

/**
 * This class represent the base user
 * or primary actor
 * of the application
 * @author Srijan Sood
 * @version 1.0
 */
public class User extends ParseUser {
    private int uid;
    private String username;
    private String password;
    private List<User> friendList;




}
