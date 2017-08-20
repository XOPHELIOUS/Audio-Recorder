package com.beans.audiorecorder;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton toggle = (FloatingActionButton) findViewById(R.id.micToggle);

        toggle.setOnClickListener(new View.OnClickListener() {
            TextView toggleText = findViewById(R.id.toggleText);
            boolean on = false;

            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            public void onClick(View v) {
                if (on) {
                    on = false;
                    v.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.toggleOff)));
                    toggleText.setText("");
                }
                else {
                    on = true;
                    v.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.toggleOn)));
                    toggleText.setText(R.string.recording);
                }
            }
        });

    }
}
