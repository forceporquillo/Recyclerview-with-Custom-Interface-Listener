package com.force.codes.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TvShowActivity extends AppCompatActivity
        implements View.OnClickListener{

    Button button;
    EditText editText;
    TextView showTitle;
    TextView getEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_show);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.edit_Text);
        showTitle = findViewById(R.id.tvShow);
        getEditText = findViewById(R.id.getText);

        Intent intent = getIntent();
        String title = intent.getStringExtra("tvShowTitle");

        showTitle.setText(title);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        getEditText.setText(editText.getText());
    }
}