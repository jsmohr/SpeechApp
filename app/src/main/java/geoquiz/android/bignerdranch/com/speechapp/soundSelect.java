package geoquiz.android.bignerdranch.com.speechapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


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
                        Bundle extras = new Bundle();
                        extras.putString("question", answer);
                        extras.putString("sound", "puh");
                        i.putExtras(extras);
                        startActivity(i); //starts questionMaker
                        finish(); //kills activity
                    } else { // if this is after the first time its been run...
                        Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                        Bundle extras = new Bundle();
                        extras.putString("question", answer);
                        extras.putString("sound", "puh");
                        returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        returnIntent.putExtras(extras);
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
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "buh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "buh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button3 = (ImageButton)findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'TUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "tuh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "tuh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'DUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "duh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "duh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'CH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "ch");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "ch");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'JUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "juh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "juh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button7 = (ImageButton)findViewById(R.id.imageButton7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'KUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "kuh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "kuh");
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    returnIntent.putExtras(extras);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button8 = (ImageButton)findViewById(R.id.imageButton8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'GUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "guh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "guh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button9 = (ImageButton)findViewById(R.id.imageButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'FFF' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "fff");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "fff");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button10 = (ImageButton)findViewById(R.id.imageButton10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'V' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "vvv");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "vvv");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button11 = (ImageButton)findViewById(R.id.imageButton11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'TH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "th");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "th");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button12 = (ImageButton)findViewById(R.id.imageButton12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'TH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "vth");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "vth");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button13 = (ImageButton)findViewById(R.id.imageButton13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'SSS' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "sss");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "sss");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button14 = (ImageButton)findViewById(R.id.imageButton14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'ZZZ' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "zzz");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "zzz");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });

        ImageButton button17 = (ImageButton)findViewById(R.id.imageButton17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'MMM' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "mmm");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "mmm");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button18 = (ImageButton)findViewById(R.id.imageButton18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'NNN' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "nnn");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "nnn");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button19 = (ImageButton)findViewById(R.id.imageButton19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'SHH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "shh");
                    i.putExtras(extras);
                    i.putExtra("question", answer);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "shh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button20 = (ImageButton)findViewById(R.id.imageButton20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'HHH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "hhh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "hhh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button21 = (ImageButton)findViewById(R.id.imageButton21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'LLL' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "lll");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "lll");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button22 = (ImageButton)findViewById(R.id.imageButton22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'RRR' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "rrr");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "rrr");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button23 = (ImageButton)findViewById(R.id.imageButton23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'WUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "wuh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "wuh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    setResult(2, returnIntent);
                    finish(); // kills activity
                }
            }

        });
        ImageButton button24 = (ImageButton)findViewById(R.id.imageButton24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = "Choose the picture that starts with the 'YUH' sound:";
                if (firstRun) {// this is the first time it's been run...
                    Intent i = new Intent(getApplicationContext(), questionActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "yuh");
                    i.putExtras(extras);
                    startActivity(i); //starts questionMaker
                    finish(); //kills activity
                } else { // if this is after the first time its been run...
                    Intent returnIntent = new Intent();// code here is for passing back the next selected sound
                    Bundle extras = new Bundle();
                    extras.putString("question", answer);
                    extras.putString("sound", "yuh");
                    returnIntent.putExtras(extras);
                    returnIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
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
