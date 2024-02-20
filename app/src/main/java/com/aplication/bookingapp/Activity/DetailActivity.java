package com.aplication.bookingapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
    }

    private void getBundles() {
    }
}