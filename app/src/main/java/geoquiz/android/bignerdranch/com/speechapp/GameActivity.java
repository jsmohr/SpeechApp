package geoquiz.android.bignerdranch.com.speechapp;

/**
 * Created by jsmoh_000 on 4/13/2015.
 */

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends ActionBarActivity {

    private ImageView ib1;
    private ImageView ib2;
    private ImageView ib3;
    private ImageView ib4;
    private TextView question;
    private int correct;
    private int filePath;
    private int qNum;
    private ArrayList<questionVariable> testing;
    private boolean cor;
    private boolean inc;
    private int corNum;
    private String[] images;
    private Resources res;
    private Button dButton;
    private int numQues;
    private String sound;




    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);
        res = getResources();
        dButton = (Button) findViewById(R.id.button);
        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });



        testing = this.getIntent().getParcelableArrayListExtra("arraySent");
        numQues = testing.size();
        cor = true;
        inc = false;
        qNum = 0;
        filePath = testing.get(qNum).getPictureID();
        sound = testing.get(qNum).getSoundName();
        ib1 = (ImageView)findViewById(R.id.ansButton1);
        ib2 = (ImageView)findViewById(R.id.ansButton2);
        ib3 = (ImageView)findViewById(R.id.ansButton3);
        ib4 = (ImageView)findViewById(R.id.ansButton4);
        question = (TextView)findViewById(R.id.questionText);
        question.setText(testing.get(qNum).getQuestion());
        corNum = setRandCorrect();
        if(corNum == 1){
            ib1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(cor);
                }
            });
            ib1.setImageResource(filePath);
            ib2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib2.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib3.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib4.setImageResource(getImageId(this, pullRandInc(randIncList())));
        }else if(corNum == 2){
            ib1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib1.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(cor);
                }
            });
            ib2.setImageResource(filePath);
            ib3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib3.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib4.setImageResource(getImageId(this, pullRandInc(randIncList())));
        }else if(corNum == 3){
            ib1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib1.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib2.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib3.setImageResource(filePath);
            ib3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(cor);
                }
            });
            ib4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib4.setImageResource(getImageId(this, pullRandInc(randIncList())));
        }else{
            ib1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib1.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib2.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(inc);
                }
            });
            ib3.setImageResource(getImageId(this, pullRandInc(randIncList())));
            ib4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer(cor);
                }
            });
            ib4.setImageResource(filePath);
        }

        for (questionVariable value : testing) {
            System.out.println(value);
        }


    }

    public boolean checkAnswer(boolean ans)
    {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.toast_layout_root));
        TextView message = (TextView) layout.findViewById(R.id.toast_text);

        if(ans){

            message.setText("Correct");
            message.setTextSize(275);
            message.setTextColor(Color.GREEN);
            Toast toastie = new Toast(getApplicationContext());
            toastie.setGravity(Gravity.CENTER, 0,0);
            toastie.setView(layout);
            toastie.show();
            reset();
            return true;
        }else{
            message.setText("Try Again");
            message.setTextSize(275);
            message.setTextColor(Color.RED);
            Toast toastie = new Toast(getApplicationContext());
            toastie.setGravity(Gravity.CENTER, 0,0);
            toastie.setView(layout);
            toastie.show();
            return false;
        }

    }

    protected int setRandCorrect(){
        int x = 0;
        Random r = new Random();
        x = r.nextInt(4-1)+1;

        return x;
    }

    protected int randIncList(){
        int x = 0;
        Random r = new Random();
        x = r.nextInt(23-1)+1;

        return x;
    }

    protected String pullRandInc(int z){
        String thing = "";
        Boolean cont = true;
        while(cont) {
            if (z == 1 && !sound.equals("buh")) {
                images = res.getStringArray(R.array.buh);
                cont = false;
            } else if (z == 2 && !sound.equals("ch")) {
                images = res.getStringArray(R.array.ch);
                cont = false;
            } else if (z == 3 && !sound.equals("duh")) {
                images = res.getStringArray(R.array.duh);
                cont = false;
            } else if (z == 4 && !sound.equals("fff")) {
                images = res.getStringArray(R.array.fff);
                cont = false;
            } else if (z == 5 && !sound.equals("guh")) {
                images = res.getStringArray(R.array.guh);
                cont = false;
            } else if (z == 6 && !sound.equals("hhh")) {
                images = res.getStringArray(R.array.hhh);
                cont = false;
            } else if (z == 7 && !sound.equals("juh")) {
                images = res.getStringArray(R.array.juh);
                cont = false;
            } else if (z == 8 && !sound.equals("kuh")) {
                images = res.getStringArray(R.array.kuh);
                cont = false;
            } else if (z == 9 && !sound.equals("lll")) {
                images = res.getStringArray(R.array.lll);
                cont = false;
            } else if (z == 10 && !sound.equals("mmm")) {
                images = res.getStringArray(R.array.mmm);
                cont = false;
            } else if (z == 11 && !sound.equals("nnn")) {
                images = res.getStringArray(R.array.nnn);
                cont = false;
            } else if (z == 12 && !sound.equals("puh")) {
                images = res.getStringArray(R.array.puh);
                cont = false;
            } else if (z == 13 && !sound.equals("rrr")) {
                images = res.getStringArray(R.array.rrr);
                cont = false;
            } else if (z == 14 && !sound.equals("shh")) {
                images = res.getStringArray(R.array.shh);
                cont = false;
            } else if (z == 15 && !sound.equals("sss")) {
                images = res.getStringArray(R.array.sss);
                cont = false;
            } else if (z == 16 && !sound.equals("th")) {
                images = res.getStringArray(R.array.th);
                cont = false;
            } else if (z == 17 && !sound.equals("tuh")) {
                images = res.getStringArray(R.array.tuh);
                cont = false;
            } else if (z == 18 && !sound.equals("vth")) {
                images = res.getStringArray(R.array.vth);
                cont = false;
            } else if (z == 19 && !sound.equals("vvv")) {
                images = res.getStringArray(R.array.vvv);
                cont = false;
            } else if (z == 20 && !sound.equals("wuh")) {
                images = res.getStringArray(R.array.wuh);
                cont = false;
            } else if (z == 21 && !sound.equals("yuh")) {
                images = res.getStringArray(R.array.yuh);
                cont = false;
            } else if (z == 22 && !sound.equals("zzz")) {
                images = res.getStringArray(R.array.zzz);
                cont = false;
            } else {
                z++;
            }
        }
        int x = 0;
        Random r = new Random();
        x = r.nextInt(4-1)+1;
        thing = images[x];
        return thing;
    }

    public static int getImageId(Context context, String imageName){
        System.out.println(context.getResources().getIdentifier("mipmap/" + imageName, null, context.getPackageName()));
        return context.getResources().getIdentifier("@mipmap/" + imageName, null, context.getPackageName());
    }

    protected void reset(){
        if(qNum < numQues-1) {
            qNum = qNum+1;

            filePath = testing.get(qNum).getPictureID();
            question.setText(testing.get(qNum).getQuestion());
            sound = testing.get(qNum).getSoundName();
            correct = setRandCorrect();
            if(correct == 1){
                ib1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(cor);
                    }
                });
                ib1.setImageResource(filePath);
                ib2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib2.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib3.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib4.setImageResource(getImageId(this, pullRandInc(randIncList())));
            }else if(correct == 2){
                ib1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib1.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(cor);
                    }
                });
                ib2.setImageResource(filePath);
                ib3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib3.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib4.setImageResource(getImageId(this, pullRandInc(randIncList())));
            }else if(correct == 3){
                ib1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib1.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib2.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib3.setImageResource(filePath);
                ib3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(cor);
                    }
                });
                ib4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib4.setImageResource(getImageId(this, pullRandInc(randIncList())));
            }else{
                ib1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib1.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib2.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(inc);
                    }
                });
                ib3.setImageResource(getImageId(this, pullRandInc(randIncList())));
                ib4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(cor);
                    }
                });
                ib4.setImageResource(filePath);
            }
        }else{
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.toast_layout_root));
            TextView message = (TextView) layout.findViewById(R.id.toast_text);
            message.setText("You Finished!");
            message.setTextSize(275);
            message.setTextColor(Color.BLUE);
            Toast toastie = new Toast(getApplicationContext());
            toastie.setGravity(Gravity.CENTER, 0,0);
            toastie.setView(layout);
            toastie.show();
            Intent i = new Intent(GameActivity.this, MainActivity.class);
            startActivity(i);
            finish();

        }
    }
}
