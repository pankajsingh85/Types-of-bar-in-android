package com.pankaj.barsinandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class NextActivity extends AppCompatActivity {

    Button button_incr,button_decr;
    ProgressBar progressBar;
    TextView text_view_progress;
    private int progr=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        button_incr=findViewById(R.id.button_incr);
        button_decr=findViewById(R.id.button_decr);
        progressBar=findViewById(R.id.progress_bar);
        text_view_progress=findViewById(R.id.text_view_progress);

        updateProgressBar();

        button_incr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progr <= 90) {
                    progr += 10;
                    updateProgressBar();
                }
            }
        });

        button_decr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progr>=10 &&progr <= 90) {
                    progr -= 10;
                    updateProgressBar();
                }
            }
        });

        // initiate progress bar and start button
        final ProgressBar simpleProgressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
        Button startButton = (Button) findViewById(R.id.startButton);
        // perform click event on button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // visible the progress bar
                simpleProgressBar.setVisibility(View.VISIBLE);
            }
        });
    }

    private void updateProgressBar() {
        progressBar.setProgress(progr);
        text_view_progress.setText(String.valueOf(progr+"%"));
    }
}
