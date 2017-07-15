package com.example.diksha.quiz;
import android.R.*;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv2;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btnnext;
    int id;
    int count=0;
    Questions q1,q2,q3,q4,q;
    ArrayList<Questions> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.ques);
        radioGroup=(RadioGroup)findViewById(R.id.rg1);
        btnnext=(Button)findViewById(R.id.button);
        tv2=(TextView)findViewById(R.id.timer);
        id=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton)findViewById(id);
        q1=new Questions("Ques 1.What is the full form of SMTP?","Simple Mail Transfer Protocol",
                "Simple Mail Text Person","Simple Message Transfer Protocol","Sound Mail Text Pattern");

        q2=new Questions("Ques 2.What is the full form of TCP?","Transfer Control Protocol",
                "Text Control Protocol","Transfer Communication Person","Text Control Person");

        q3=new Questions("Ques 3.What DNS stands for?","Domain Name System","Domain Name Server","Distributed Name Server",
                "Distributed Name System");

        q4=new Questions("Ques 4.What is a port?","Numbered Socket","Protocol","Server","Path");
        list=new ArrayList<>();
        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);

        String one=q1.getQues();
        tv.setText(one);
        ((RadioButton) radioGroup.getChildAt(0)).setText(q1.getOption1());
        ((RadioButton) radioGroup.getChildAt(1)).setText(q1.getOption2());
        ((RadioButton) radioGroup.getChildAt(2)).setText(q1.getOption3());
        ((RadioButton) radioGroup.getChildAt(3)).setText(q1.getOption4());
        startTimer(60,tv2);
            btnnext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(count<=list.size())
                    {
                        count++;
                        setQuestion();
                    }
                }
            });
        }

    public void setQuestion(){
        tv.setText(list.get(count).getQues());
        ((RadioButton) radioGroup.getChildAt(0)).setText(list.get(count).getOption1());
        ((RadioButton) radioGroup.getChildAt(1)).setText(list.get(count).getOption2());
        ((RadioButton) radioGroup.getChildAt(2)).setText(list.get(count).getOption3());
        ((RadioButton) radioGroup.getChildAt(3)).setText(list.get(count).getOption4());
    }
    //Declare timer
    CountDownTimer cTimer = null;
    //start timer function
    void startTimer(int Seconds,final TextView tv) {
        cTimer = new CountDownTimer(Seconds* 1000+1000, 1000) {
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;
                tv.setText("TIME : " + String.format("%02d", minutes)
                        + ":" + String.format("%02d", seconds));
            }
            public void onFinish() {
                tv2.setText("Times Up!");
            }
        };
        cTimer.start();
    }

    //cancel timer
    void cancelTimer() {
        if(cTimer!=null)
            cTimer.cancel();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cTimer.cancel();
    }


    }

