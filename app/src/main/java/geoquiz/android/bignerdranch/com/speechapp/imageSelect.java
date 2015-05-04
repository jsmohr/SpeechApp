package geoquiz.android.bignerdranch.com.speechapp;

import android.content.Context;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by jsmoh_000 on 5/2/2015.
 */
public class imageSelect extends Activity {

    private Resources res;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private String sound;
    private String question;
    //private String "question";
    private String[] images;
    private int imgID1;
    private int imgID2;
    private int imgID3;
    private int imgID4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_select);
        res = getResources();
        //"question" = "";
        sound = getIntent().getStringExtra("sound");
        question = getIntent().getStringExtra("question");
        System.out.println(sound+question);
        img1 = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img3 = (ImageView) findViewById(R.id.imageView3);
        img4 = (ImageView) findViewById(R.id.imageView4);
        if(sound.equals("buh")){
            images = res.getStringArray(R.array.buh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("ch")){

            images = res.getStringArray(R.array.ch);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("duh")){

            images = res.getStringArray(R.array.duh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("fff")){

            images = res.getStringArray(R.array.fff);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("guh")){

            images = res.getStringArray(R.array.guh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("hhh")){

            images = res.getStringArray(R.array.hhh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("juh")){

            images = res.getStringArray(R.array.juh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("kuh")){

            images = res.getStringArray(R.array.kuh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("lll")){

            images = res.getStringArray(R.array.lll);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("mmm")){

            images = res.getStringArray(R.array.mmm);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("nnn")){

            images = res.getStringArray(R.array.nnn);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("puh")){

            images = res.getStringArray(R.array.puh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("rrr")){

            images = res.getStringArray(R.array.rrr);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("shh")){

            images = res.getStringArray(R.array.shh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("sss")) {

            images = res.getStringArray(R.array.sss);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("th")) {

            images = res.getStringArray(R.array.th);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("tuh")) {

            images = res.getStringArray(R.array.tuh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("vth")) {

            images = res.getStringArray(R.array.vth);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("vvv")) {

            images = res.getStringArray(R.array.vvv);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("wuh")) {

            images = res.getStringArray(R.array.wuh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("yuh")) {

            images = res.getStringArray(R.array.yuh);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }else if(sound.equals("zzz")) {

            images = res.getStringArray(R.array.zzz);
            imgID1 = getImageId(this, images[0]);
            img1.setImageResource(imgID1);
            imgID2 = getImageId(this, images[1]);
            img2.setImageResource(imgID2);
            imgID3 = getImageId(this, images[2]);
            img3.setImageResource(imgID3);
            imgID4 = getImageId(this, images[3]);
            img4.setImageResource(imgID4);

        }

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                Bundle extras = new Bundle();
                extras.putString("sound", sound);
                extras.putInt("image", imgID1);
                extras.putString("question", question);
                i.putExtras(extras);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                setResult(2, i);
                finish();

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                Bundle extras = new Bundle();
                extras.putString("sound", sound);
                extras.putInt("image", imgID2);
                extras.putString("question", question);
                i.putExtras(extras);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                setResult(2, i);
                finish();

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                Bundle extras = new Bundle();
                extras.putString("sound", sound);
                extras.putInt("image", imgID3);
                extras.putString("question", question);
                i.putExtras(extras);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                setResult(2, i);
                finish();

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                Bundle extras = new Bundle();
                extras.putString("sound", sound);
                extras.putInt("image", imgID4);
                extras.putString("question", question);
                i.putExtras(extras);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                setResult(2, i);
                finish();

            }
        });



    }

    public static int getImageId(Context context, String imageName){
        System.out.println(context.getResources().getIdentifier("mipmap/" + imageName, null, context.getPackageName()));
        return context.getResources().getIdentifier("@mipmap/" + imageName, null, context.getPackageName());
    }

    }
