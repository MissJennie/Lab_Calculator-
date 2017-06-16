package com.example.sorphorn.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Create object
        Button btnsum = (Button) findViewById(R.id.buttonsum);
        Button btnsub = (Button) findViewById(R.id.buttonsub);
        Button btndiv = (Button) findViewById(R.id.buttondiv);
        Button btnmul = (Button) findViewById(R.id.buttonmul);
        final EditText etv = (EditText) findViewById(R.id.editText1);
        final EditText etv2 = (EditText) findViewById(R.id.editText2);
        final TextView result = (TextView) findViewById(R.id.textView1);
        // Create button click event
        btnsum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float x = new Integer(etv.getText().toString());
                float y = new Integer(etv2.getText().toString());
                float sum = x + y; //Perform Maths operation
                result.setText("The answer of " + x + " + " + y + " = " + sum);//print answer
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float x = new Integer(etv.getText().toString());
                float y = new Integer(etv2.getText().toString());
                float sub = x - y; //Perform Maths operation
                result.setText("The answer of " + x + " - " + y + " = " + sub);//print answer
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float x = new Integer(etv.getText().toString());
                float y = new Integer(etv2.getText().toString());
                float div = x / y; //Perform Maths operation
                result.setText("The answer " + x + " / " + y + " = " + div);//print answer
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float x = new Integer(etv.getText().toString());
                float y = new Integer(etv2.getText().toString());
                float mul = x * y; //Perform Maths operation
                result.setText("The answer of " + x + " * " + y + " = " + mul);//Print answer
            }
        });
    }

}
