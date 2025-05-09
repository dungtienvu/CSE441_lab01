package com.example.cse441_labs;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText edtA, edtB, edtKQ;
View btntong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA= findViewById(R.id.edtA);
        edtB= findViewById(R.id.edtB);
        edtKQ= findViewById(R.id.edtKQ);
        btntong= findViewById(R.id.btntong);
        btntong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a + b;
                edtKQ.setText(c+ "");
            }
        });

    }
}