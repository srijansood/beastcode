package gt2340.beastcode.swf;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.ParseUser;


public class FriendActivity extends ActionBarActivity {

    private EditText friendEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        friendEditText = (EditText) findViewById(R.id.friend);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_friend, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void addNewFriend(View view){
//        if (f == null || !f.isUser()) {
//            //exception
//        }
        String friendUsername = friendEditText.getText().toString().trim();
        //User f = Frien.....create User object using username?
        //check is valid (registered) user
        //check if user's friend list already contains
        //add to friendList
    }


    /**
     * Deletes a friend from a user's friendlist.
     * @param f friend to be deleted
     */
    private void deleteFriend(User f) {
//        if (f == null || !f.isUser()) {
//            //exception
//        }
        //currUser.friendList.remove(f);
        //Direct access, unsafe ^ ?
    }
}
