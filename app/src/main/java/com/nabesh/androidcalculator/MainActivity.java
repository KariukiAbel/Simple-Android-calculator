package com.nabesh.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
Button btn;
EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv1);
        btn=findViewById(R.id.button);
        ed1=findViewById(R.id.editText4);
        ed2=findViewById(R.id.ed5);

    }

    public void Next(View view) {
        double num1=Double.parseDouble(ed1.getText().toString());
        double num2=Double.parseDouble(ed2.getText().toString());
        double num3=num1+num2;
        tv.setText("Sum of the entered numbers is: "+num3);
    }
}
