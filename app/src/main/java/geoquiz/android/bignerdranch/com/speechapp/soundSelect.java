package geoquiz.android.bignerdranch.com.speechapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;import java.lang.Override;import java.lang.String;import comsitelandonlambvsu.google.httpssites.findthatsound.R;


public class soundSelect extends Activity {
    public boolean firstRun = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_select);
        firstRun = getIntent().getBooleanExtra("secondRun",true);
        ImageButton button1 = (ImageButton)findViewById(R.id.imageButton);
        button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view) {
                    String answer = "Choose the picture that starts with the 'PUH' sound:";
                    if (firstRun) {// this is the first time it's been run...
                        Intent i = new Intent(getApplicationContext(), questionActivity.class);
                        i.putExtra(questionActivity.keyName, answer);
                        startActivity(i); //starts questionMaker
                        finish(); //kills activity
                    } else { // if this is after the first time its been run...
                        Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                        returnIntent.putExtra(questionActivity.keyName, answer);
                        setResult(2, returnIntent);
                        finish(); // kills activity
                    }
                }

        });
        ImageButton button2 = (ImageButton)findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'BUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    i.putExtra(questionActivity.keyName, answer);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    returnIntent.putExtra(questionActivity.keyName, answer);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sound_select, menu);
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
}
