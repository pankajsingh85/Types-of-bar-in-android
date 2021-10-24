package com.pankaj.ratingbar2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    RatingBar ratingbar;
    SeekBar seekBar;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        seekBar=(SeekBar)findViewById(R.id.seekBar);
        ratingbar = findViewById(R.id.ratingBar);
        ratingbar.setRating(1.5f);

        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
        @Override public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        ratingbar.setRating(rating);
        Toast.makeText(MainActivity.this,"new Rating is : "+String.valueOf(rating),Toast.LENGTH_LONG).show();
        }
        });



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}