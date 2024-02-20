package com.aplication.bookingapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.aplication.bookingapp.Domain.PropertyDomain;
import com.aplication.bookingapp.R;
import com.aplication.bookingapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    private PropertyDomain object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        getBundles();
        setVariable();
    }

    private void setVariable() {
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        int drawableResource = getResources().getIdentifier(object.getPicPath(),"drawable", DetailActivity.this.getPackageName());
    }

    private void getBundles() {
    }
}