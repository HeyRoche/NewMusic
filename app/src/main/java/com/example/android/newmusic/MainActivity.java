package com.example.android.newmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Used to find the view for the artist selections
        View xXX = findViewById(R.id.xxx);
        View billie = findViewById(R.id.billie);
        ImageView xImage = findViewById(R.id.xphoto);
        ImageView bImage = findViewById(R.id.billiephoto);

        //Sets the on click listener on the view that displays the songs categories
        xXX.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, XActivity.class);
                startActivity(artistIntent);
            }
        });
        billie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, Billie.class);
                startActivity(artistIntent);
            }
        });
        xImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, XActivity.class);
                startActivity(artistIntent);
            }
        });
        bImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, Billie.class);
                startActivity(artistIntent);
            }
        });
    }
}