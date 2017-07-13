package com.example.diksha.quiz;
import android.R.*;
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
    TextView tv;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btnnext;
    int id,j;
    Questions q1,q2,q3,q4,q;
    ArrayList<Questions> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.ques);
        radioGroup=(RadioGroup)findViewById(R.id.rg1);
        btnnext=(Button)findViewById(R.id.button);
        id=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton)findViewById(id);
        q1=new Questions();
        q1.setQues("Ques 1.What is the full form of SMTP?");
        q1.setOption1("Simple Mail Transfer Protocol");
        q1.setOption2("Simple Mail Text Person");
        q1.setOption3("Simple Message Transfer Protocol");
        q1.setOption4("Sound Mail Text Pattern");

        q2=new Questions();
        q2.setQues("Ques 2.What is the full form of TCP?");
        q2.setOption1("Transfer Control Protocol");
        q2.setOption2("Text Control Protocol");
        q2.setOption3("Transfer Communication Person");
        q2.setOption4("Text Control Person");

        q3=new Questions();
        q3.setQues("Ques 3.What DNS stands for?");
        q3.setOption1("Domain Name System");
        q3.setOption2("Domain Name Server");
        q3.setOption3("Distributed Name Server");
        q3.setOption4("Distributed Name System");

        q4=new Questions();
        q4.setQues("Ques 4.What is a port?");
        q4.setOption1("Numbered Socket");
        q4.setOption2("Protocol");
        q4.setOption3("Server");
        q4.setOption4("Path");
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
       btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(++j >= list.size()){
                    j = 0;
                    q=list.get(j);
                    tv.setText(q.getQues());
                }

            }
        });

    }
}
