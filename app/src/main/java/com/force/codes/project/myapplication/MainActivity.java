package com.force.codes.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TvShowListener{

    RecyclerView recyclerView;
    List<String> tvShows;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShows = new ArrayList<>();

        tvShows.add("southPark");
        tvShows.add("naruto");
        tvShows.add("simpsonPark");
        tvShows.add("americandad");
        tvShows.add("henlo");
        tvShows.add("fren");
        tvShows.add("keep");
        tvShows.add("safe");

        TvShowsAdapter adapter = new TvShowsAdapter(tvShows, this);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void itemListener(int position){
        Intent tvShowActivity = new Intent(this, TvShowActivity.class);
        tvShowActivity.putExtra("tvShowTitle", tvShows.get(position));
        startActivity(tvShowActivity);
    }
}