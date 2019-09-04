package com.stalwart.foodrecipes.activity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.stalwart.foodrecipes.R;

public abstract class BaseActivity extends AppCompatActivity {

    public ProgressBar progressBar;

    @Override
    public void setContentView(int layoutResID) {

        @SuppressLint("InflateParams")
        ConstraintLayout constraintLayout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_base, null);
        FrameLayout frameLayout = constraintLayout.findViewById(R.id.activity_content);
        progressBar = constraintLayout.findViewById(R.id.progress_bar);

        getLayoutInflater().inflate(layoutResID, frameLayout, true);

        super.setContentView(constraintLayout);
    }

    public void showProgressBar(boolean visibility) {
        progressBar.setVisibility(visibility ? View.VISIBLE : View.INVISIBLE);
    }
}
