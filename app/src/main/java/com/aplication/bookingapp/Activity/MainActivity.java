package com.aplication.bookingapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.aplication.bookingapp.Adapter.NearbyAdapter;
import com.aplication.bookingapp.Adapter.RecommendedAdapter;
import com.aplication.bookingapp.Domain.PropertyDomain;
import com.aplication.bookingapp.R;
import com.aplication.bookingapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private RecyclerView.Adapter adapterRecommended, adapterNearby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initLocation();
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PropertyDomain> items = new ArrayList<>();
        items.add(new PropertyDomain("Apartment","Royal Apartment", "VietNam VN","h_1",1500,
                2,3,true,4.5,"This 2 bed/1 bath home boasts an enormous,open-living plan, accented by striking architectural features and high-end finishes"));
        items.add(new PropertyDomain("House","House with Great View", "HaNoi VN","h_2",500,
                2,3,true,4.7,"This 2 bed/1 bath home boasts an enormous,open-living plan, accented by striking architectural features and high-end finishes"));
        items.add(new PropertyDomain("Villa","Royal Villa", "HoChiMinh VN","h_3",3500,
                2,1,true,4.9,"This 2 bed/1 bath home boasts an enormous,open-living plan, accented by striking architectural features and high-end finishes"));

        binding.recommendedView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterRecommended = new RecommendedAdapter(items);
        binding.recommendedView.setAdapter(adapterRecommended);

        binding.nearbyView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapterNearby = new NearbyAdapter(items);
        binding.nearbyView.setAdapter(adapterNearby);
    }

    private void initLocation() {
        String [] items = new String[] {"VietNam , VN","NewYork, USA"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        binding.locationSpin.setAdapter(adapter);
    }
}