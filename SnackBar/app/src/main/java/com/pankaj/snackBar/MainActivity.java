package com.pankaj.snackBar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button normal, action, custom;
    RelativeLayout relativelayout,relativelayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativelayout = findViewById(R.id.relativelayout);
        relativelayout2=findViewById(R.id.relativeLayout2);
        normal = findViewById(R.id.normal);
        action = findViewById(R.id.action);
        custom = findViewById(R.id.custom);


        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "", Snackbar.LENGTH_LONG);
                View customSnackView = getLayoutInflater().inflate(R.layout.custom_snackbar, null);
                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                snackbarLayout.setPadding(0, 0, 0, 0);
                snackbarLayout.addView(customSnackView, 0);
                snackbar.show();
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snack = Snackbar.make(relativelayout, "I am normal", Snackbar.LENGTH_LONG);
                snack.show();
            }
        });


        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snack = Snackbar.make(relativelayout, "Mail send", Snackbar.LENGTH_LONG);

                snack.setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Action Clicked", Toast.LENGTH_SHORT).show();

                    }
                });
                snack.show();
            }
        });



    }
}