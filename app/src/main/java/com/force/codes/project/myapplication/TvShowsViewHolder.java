package com.force.codes.project.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// This provides a reference to the views for each data item.
public class TvShowsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView showTitle;
    TvShowListener listener;

    public TvShowsViewHolder(@NonNull View itemView, TvShowListener listener){
        super(itemView);
        this.itemView.setOnClickListener(this);
        this.listener = listener;
        showTitle = itemView.findViewById(R.id.text);
    }

    @Override
    public void onClick(View v){
        listener.itemListener(getAdapterPosition());
    }
}