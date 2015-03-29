package beastcode.swf;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class LoginActivity extends ActionBarActivity {

    private EditText userEditText, passEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Parse.initialize(this, "qf1Y60qpWiX7jR39xGb8jNaMOXe9Va2RsgxnLBK6", "nUOtET9LJpyJVwL2zqbqpQCpWLnvKXNwAX7PrZHU");
        userEditText = (EditText) findViewById(R.id.username);
        passEditText = (EditText) findViewById(R.id.password);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    /**
     *
     * @param view
     * @return
     */
    private void login(View view) {
        String username = userEditText.getText().toString().trim();
        String password = passEditText.getText().toString().trim();
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (user != null) {
                    Toast.makeText(LoginActivity.this, "Login Success!",
                            Toast.LENGTH_LONG).show();
                } else {
                    // Signup failed. Look at the ParseException to see what happened.
                    Toast.makeText(LoginActivity.this, e.getMessage(),
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    /**
     * Sign up a new user
     * @param view
     * @return
     */
    private void register(View view) {
        String username = userEditText.getText().toString().trim();
        String password = passEditText.getText().toString().trim();
        boolean done = false;

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {
                    Toast.makeText(LoginActivity.this, "Success!",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LoginActivity.this, e.getMessage(),
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    //TODO
    private boolean loginfb(View view) {
        return false;
    }
}
