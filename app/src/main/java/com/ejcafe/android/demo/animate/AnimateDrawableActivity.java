package com.ejcafe.android.demo.animate;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ejcafe.android.demo.R;

public class AnimateDrawableActivity extends AppCompatActivity {
    private ImageView imageView;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_drawable);
        imageView = findViewById(R.id.imageview);
        imageView.setImageResource(R.drawable.anim_demo);
        animationDrawable = (AnimationDrawable) imageView.getDrawable();

        imageView.setOnClickListener((View view) -> {
            animationDrawable.start();
        });
    }
}
