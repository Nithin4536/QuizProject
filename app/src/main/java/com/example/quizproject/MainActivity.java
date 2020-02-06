package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
Intent i;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        t1=findViewById(R.id.textView8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String a=t1.getText().toString();
            i=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this,"Welcome  "+a,Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });
    }
}

