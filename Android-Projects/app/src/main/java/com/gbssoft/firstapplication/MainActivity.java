package com.gbssoft.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clickButton;
        TextView changeResult;
        Button clickButton2;
        TextView changeResult2;

        clickButton = findViewById(R.id.clickButton);
        changeResult = findViewById(R.id.changeResult);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeResult.setText("Hello world");
            }
        });


        clickButton2 = findViewById(R.id.clickButton2);
        changeResult2 = findViewById(R.id.changeResult2);

        clickButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton2.setText("Clicked here");
                changeResult2.setText("Hello everyone this si coder boy galib coder boy galib is a mern stack web and mobile application developer");
            }
        });
    }




}






