package com.nofliegroup.learningapp_for_kids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class FruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        String name = getIntent().getStringExtra("name").toLowerCase();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

        ImageView iv = findViewById(R.id.imageView2);
        int id = getResources().getIdentifier(name, "drawable", getPackageName());
        iv.setImageResource(id);

        // audio file missing for this activity
        //int mid = getResources().getIdentifier(name, "raw", getPackageName());
        //MediaPlayer mp = MediaPlayer.create(this, mid);
        //mp.start();



    }
}