package com.aplication.bookingapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aplication.bookingapp.Domain.PropertyDomain;
import com.aplication.bookingapp.databinding.NearbyViewholderBinding;
import com.aplication.bookingapp.databinding.RecommendedViewholderBinding;

import java.util.ArrayList;

public class NearbyAdapter extends RecyclerView.Adapter<NearbyAdapter.Viewholder> {

    ArrayList<PropertyDomain> items;
    Context context;
    NearbyViewholderBinding binding;

    public NearbyAdapter(ArrayList<PropertyDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public NearbyAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = NearbyViewholderBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        context = parent.getContext();
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NearbyAdapter.Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(NearbyViewholderBinding binding) {
            super(binding.getRoot());
        }
    }
}
