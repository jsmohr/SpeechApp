package geoquiz.android.bignerdranch.com.speechapp;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;import comsitelandonlambvsu.google.httpssites.findthatsound.R;import comsitelandonlambvsu.google.httpssites.findthatsound.imageTesterActivity;import comsitelandonlambvsu.google.httpssites.findthatsound.questionVariable;import comsitelandonlambvsu.google.httpssites.findthatsound.soundSelect;


public class questionActivity extends Activity {

    public static final String keyName = "";
    String questionName;
    int questionNumber = 1;
    ArrayList<questionVariable> userQuestions = new ArrayList<>();
    TextView userQuestion, questionNum;
    Button next, done, pictureButton;
    ImageView userSelectedImage;
    String imagePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        questionName = getIntent().getStringExtra(keyName); //first time getter for the string
        initializeVariables();
        setupTextFields();
        setupButtonClicks();

    }

    public void setupButtonClicks()
    {
        next.setOnClickListener(new View.OnClickListener() { //what happens when user clicks next button
            @Override
            public void onClick(View view) {
                questionVariable question = new questionVariable(); //creates our variable to add
                question.setQuestion(questionName); // sets the string on our variable..
                question.setPictureID(imagePath);
                userQuestions.add(question);  //adds question constructor variable to the array
                //Starts the sound select activity to choose next sound...
                Intent i = new Intent(getApplicationContext(), soundSelect.class); //creates intent
                i.putExtra("secondRun", false);// tells the first activity that it's not the first time its being run..
                startActivityForResult(i, 2); //starts the sound selector activity


            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionVariable question = new questionVariable(); //creates our variable to add
                question.setQuestion(questionName); // sets the string on our variable..
                question.setPictureID(imagePath);//sets the image filepath to pass on
                userQuestions.add(question);  //adds question constructor variable to the array
                Intent tester = new Intent(getApplicationContext(), imageTesterActivity.class); //creates intent
                tester.putParcelableArrayListExtra("arraySent", userQuestions);
                startActivity(tester);
                finish();
                //prints out our array just for testing purposes
                /*for (questionVariable value : userQuestions) {
                    System.out.println(value);
                }*/
            }
        });
        pictureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent();

                //intent.setAction(Intent.ACTION_GET_CONTENT);
                //startActivityForResult(Intent.createChooser(intent, "Select Picture"), 3);
                Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                // Start the Intent
                startActivityForResult(galleryIntent, 3);
            }
        });
    }

    @Override //Receives the next sound questions from the first activity..
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            questionName = data.getStringExtra(keyName);
            userSelectedImage.setImageDrawable(null);
            userQuestion.setText(questionName);
            questionNumber++;
            questionNum.setText(Integer.toString(questionNumber) + ":");
        }
        if (requestCode == 3 && resultCode == RESULT_OK && null != data) {
            // Get the Image from data

            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };

            // Get the cursor
            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            // Move to first row
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            imagePath = cursor.getString(columnIndex);
            cursor.close();

            // Set the Image in ImageView after decoding the String
            userSelectedImage.setImageBitmap(BitmapFactory.decodeFile(imagePath));
            System.out.println(imagePath);

        }

            super.onActivityResult(requestCode, resultCode, data);
    }

    public void setupTextFields()
    {
        questionNum.setText(Integer.toString(questionNumber) + ":");
        userQuestion.setText(questionName);
        userQuestion.setPaintFlags(userQuestion.getPaintFlags() |  Paint.UNDERLINE_TEXT_FLAG);
    }

    public void initializeVariables()
    {
        userQuestion = (TextView)findViewById(R.id.passedUserQuestion);
        questionNum = (TextView)findViewById(R.id.questionNumber);
        next = (Button)findViewById(R.id.nextButton);
        done = (Button)findViewById(R.id.doneButton);
        pictureButton = (Button)findViewById(R.id.pictureButton);
        userSelectedImage = (ImageView)findViewById(R.id.userImage);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question, menu);
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
