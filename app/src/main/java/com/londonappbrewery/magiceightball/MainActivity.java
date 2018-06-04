package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button askButton = (Button) findViewById(R.id.askButton);

        final ImageView answerImage = (ImageView) findViewById(R.id.answerImage);

        final int[] answerImages = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };


        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MagicEightBall", "You've pressed the ask button");

                Random randomNum = new Random();

                answerImage.setImageResource(answerImages[randomNum.nextInt(4)]);
            }
        });


    }
}
