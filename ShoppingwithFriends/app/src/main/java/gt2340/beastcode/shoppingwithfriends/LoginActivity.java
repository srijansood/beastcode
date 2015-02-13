package gt2340.beastcode.shoppingwithfriends;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

    private EditText userU, passU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userU = (EditText) findViewById(R.id.editText1);
        passU = (EditText) findViewById(R.id.editText2);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_autheticated, menu);
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

    public void cancelLogin(View view) {
        Intent i = new Intent(getBaseContext(), LaunchActivity.class);
        startActivityForResult(i, 1);
    }

    public void loginClick(View view) {
        loginWithPassword((userU.getText()).toString(), (passU.getText()).toString());
    }

    public void loginWithPassword(String email, String password) {

        Intent i;
        if (email.equals("test") && password.equals("user")) {
            i = new Intent(getBaseContext(), Autheticated.class);
        } else {
            i = new Intent(getBaseContext(), Failed.class);
        }
        startActivityForResult(i, 1);
    }
}