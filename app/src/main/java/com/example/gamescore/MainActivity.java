package com.example.gamescore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score1 = 0;
    private int score2 = 0;

    private TextView textView3ClickTeam1;
    private TextView textView4ClickTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","The onCreate method is called");

        textView3ClickTeam1 = findViewById(R.id.textView3ClickTeam1);
        textView4ClickTeam2 = findViewById(R.id.textView4ClickTeam2);

        if (savedInstanceState != null){
            score1 = savedInstanceState.getInt("score1");
            score2 = savedInstanceState.getInt("score2");
        }

        updateScore1();
        updateScore2();

        textView3ClickTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                Log.d("MainActivity", "Clicked textViewScore1");
                score1++;
                updateScore1();
            }
        });

        textView4ClickTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "Clicked textViewScore2");
                score2++;
                updateScore2();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","The onStart method is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","The onStop method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","The onResume method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","The onPause method is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","The onRestart method is called");
    }

    private void updateScore1(){
        textView3ClickTeam1.setText(String.valueOf(score1));
    }

    private void updateScore2(){
        textView4ClickTeam2.setText(String.valueOf(score2));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("MainActivity","The onSaveInstanceState method is called");
        outState.putInt("score1", score1);
        outState.putInt("score2", score2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","The onDestroy method is called");
    }
}
