package com.aplication.bookingapp.Adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aplication.bookingapp.Domain.PropertyDomain;
import com.aplication.bookingapp.databinding.RecommendedViewholderBinding;

import java.util.ArrayList;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.Viewholder> {

    ArrayList<PropertyDomain> items;
    Context context;
    RecommendedViewholderBinding binding;
    @NonNull
    @Override
    public RecommendedAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedAdapter.Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder {
    }
}
