package com.aplication.bookingapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aplication.bookingapp.R;
import com.aplication.bookingapp.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    ActivityIntroBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(R.layout.);
    }
}