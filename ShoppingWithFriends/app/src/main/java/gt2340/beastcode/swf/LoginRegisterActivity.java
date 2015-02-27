package gt2340.beastcode.swf;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class LoginRegisterActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        Parse.initialize(this, "qf1Y60qpWiX7jR39xGb8jNaMOXe9Va2RsgxnLBK6", "nUOtET9LJpyJVwL2zqbqpQCpWLnvKXNwAX7PrZHU");
        EditText userEditText = (EditText) findViewById(R.id.username);
        EditText passEditText = (EditText) findViewById(R.id.password);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_register, menu);
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
    private boolean login(View view) {

        return false;
    }

    /**
     *
     * @param view
     * @return
     */
    private boolean register(View view) {

        return false;
    }

    //TODO
    private boolean loginfb(View view) {
        return false;
    }
}
