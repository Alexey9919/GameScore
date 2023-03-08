package com.example.gamescore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int score1 = 0;
    private static int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView3ClickTeam1 = findViewById(R.id.textView3ClickTeam1);
        TextView textView4ClickTeam2 = findViewById(R.id.textView4ClickTeam2);



        textView3ClickTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3ClickTeam1.setText(String.valueOf(++score1));
            }
        });

        textView4ClickTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView4ClickTeam2.setText(String.valueOf(++score2));
            }
        });

    }
}