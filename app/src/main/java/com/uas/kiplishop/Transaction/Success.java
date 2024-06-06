package com.uas.kiplishop.Transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.uas.kiplishop.R;
import com.uas.kiplishop.databinding.ActivitySuccessBinding;

public class Success extends AppCompatActivity {
    ActivitySuccessBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivitySuccessBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        Animation fadeOut=new AlphaAnimation(1,0);
        bind.icon.setAnimation(fadeOut);

        bind.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}