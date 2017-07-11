package com.example.diksha.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    RadioGroup radioGroup;
    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.ques);
        radioGroup=(RadioGroup)findViewById(R.id.rg1);
        btnnext=(Button)findViewById(R.id.button);
        Questions q1=new Questions();
        q1.setQues("Ques 1.What is the full form of SMTP?");
        q1.setOption1("Simple Mail Transfer Protocol");
        q1.setOption2("Simple Mail Text Person");
        q1.setOption3("Simple Message Transfer Protocol");
        q1.setOption4("Sound Mail Text Pattern");

        Questions q2=new Questions();
        q1.setQues("Ques 1.2.What is the full form of TCP?");
        q1.setOption1("Transfer Control Protocol");
        q1.setOption2("Text Control Protocol");
        q1.setOption3("Transfer Communication Person");
        q1.setOption4("Text Control Person");

        Questions q3=new Questions();
        q1.setQues("Ques 1.What DNS stands for?");
        q1.setOption1("Domain Name System");
        q1.setOption2("Domain Name Server");
        q1.setOption3("Distributed Name Server");
        q1.setOption4("Distributed Name System");

        Questions q4=new Questions();
        q1.setQues("Ques 1.What is a port?");
        q1.setOption1("Numbered Socket");
        q1.setOption2("Protocol");
        q1.setOption3("Server");
        q1.setOption4("Path");
        ArrayList<Questions> list=new ArrayList<>();
        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);
    }
}
