package com.example.question1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FrameLayout box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = findViewById(R.id.box);

        Button btnUp = findViewById(R.id.btn_up);
        Button btnDown = findViewById(R.id.btn_down);
        Button btnLeft = findViewById(R.id.btn_left);
        Button btnRight = findViewById(R.id.btn_right);

        btnUp.setOnClickListener(v -> animateBox(0, -300));
        btnDown.setOnClickListener(v -> animateBox(0, 300));
        btnLeft.setOnClickListener(v -> animateBox(-300, 0));
        btnRight.setOnClickListener(v -> animateBox(300, 0));
    }

    private void animateBox(float toXDelta, float toYDelta) {
        box.animate()
                .translationXBy(toXDelta)
                .translationYBy(toYDelta)
                .rotationYBy(360) // Add a flip animation along Y-axis
                .setDuration(500)
                .start();
    }

}
