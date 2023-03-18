package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final Random RANDOM = new Random();
    private Button rollButton;
    private TextView resultText;
    int showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.button);
        resultText = findViewById(R.id.resultTextView);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCount++;
                if(resultText != null)
                    resultText.setText(Integer.toString(showCount));
            }
        });
    }
}