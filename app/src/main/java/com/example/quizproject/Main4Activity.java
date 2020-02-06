package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    RadioButton r1,rb,r2,r3;
    RadioGroup rg;
    Button b1;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        r1=findViewById(R.id.radioButton22);
        r2=findViewById(R.id.radioButton23);
        r3=findViewById(R.id.radioButton24);
        b1=findViewById(R.id.button12);
        rg=findViewById(R.id.radioGroup1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioid=rg.getCheckedRadioButtonId();
                rb=findViewById(radioid);
                if (r2 == rb){

                    Toast.makeText(Main4Activity.this,"CORRECT ANSWER :)",Toast.LENGTH_LONG).show();
                }
                else {

                    Toast.makeText(Main4Activity.this,"WRONG ANSWER :( ",Toast.LENGTH_LONG).show();
                }
                Intent i =new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(i);

            }
        });
    }
}
