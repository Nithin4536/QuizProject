package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioButton r1,rb,r2,r3;
    RadioGroup rg;
    Button b1;
String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        r1=findViewById(R.id.radioButton2);
        r2=findViewById(R.id.radioButton3);
        r3=findViewById(R.id.radioButton4);
        b1=findViewById(R.id.button2);
        rg=findViewById(R.id.radioGroup);
        

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioid=rg.getCheckedRadioButtonId();
                rb=findViewById(radioid);
                if (r1 == rb){

                    Toast.makeText(Main2Activity.this,"CORRECT ANSWER :)",Toast.LENGTH_LONG).show();
                }
                else {

                    Toast.makeText(Main2Activity.this,"WRONG ANSWER :( ",Toast.LENGTH_LONG).show();
                }
                Intent i =new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);

            }
        });


    }
}

