package com.force.codes.project.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TvShowsAdapter extends RecyclerView.Adapter<TvShowsViewHolder>{
    private List<String> list;
    private TvShowListener listener;

    // We pass a reference of List<String> and listeners from our main activity.
    TvShowsAdapter(List<String> tvShows, TvShowListener listener){
        this.list = tvShows;
        this.listener = listener;
    }

    // this initialized and inflates our item layout
    @NonNull
    @Override
    public TvShowsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.tvshows_items, parent, false);
        return new TvShowsViewHolder(view, listener);
    }

    // This replaces the content of views.
    @Override
    public void onBindViewHolder(@NonNull TvShowsViewHolder holder, int position){
        holder.showTitle.setText(list.get(position));
    }

    @Override
    public int getItemCount(){
        return list.size();
    }
}
