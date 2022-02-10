package com.gbssoft.dijitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countText, countTotal;
    Button incressCount, decressCount, resetCount;
    int count = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Here selected id=======================
        countText = findViewById(R.id.countText);
        countTotal = findViewById(R.id.countTotal);
        incressCount = findViewById(R.id.incressCount);
        decressCount = findViewById(R.id.decressCount);
        resetCount = findViewById(R.id.resetCount);
        // Here all event listener==================================


        incressCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(count == 100){
                        count = 0;
                        total = total + 100;
                        countText.setText(""+count);
                        countTotal.setText(""+total);
                    } else {
                        count++;
                        countText.setText(""+count);
                    }
            }
        });
        decressCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count > 0){
                    count--;
                    countText.setText(""+count);
                    return;
                };

            }
        });
        resetCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                total = 0;
                countTotal.setText(""+total);
                countText.setText(""+count);
            }
        });
    }
}