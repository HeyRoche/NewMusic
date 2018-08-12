package com.example.android.newmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class XActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_list);

        //Used to call methods for main menu and other playlist.
        menuButton();
        nextPlaylist();

        ArrayList<Music> title = new ArrayList<Music>();
        //Images added after looking over the Android Flavor App

        title.add(new Music(R.drawable.question, "Sad!", "?"));
        title.add(new Music(R.drawable.seventeen, "Jocelyn Flores", "17"));
        title.add(new Music(R.drawable.question, "Moonlight", "?"));
        title.add(new Music(R.drawable.question, "changes", "?"));
        title.add(new Music(R.drawable.seventeen, "Everybody Dies in the Nightmare", "17"));
        title.add(new Music(R.drawable.question, "the remedy for a broken heart", "?"));
        title.add(new Music(R.drawable.question, "Hope", "?"));
        title.add(new Music(R.drawable.question, "NUMB", "?"));
        title.add(new Music(R.drawable.seventeen, "Save Me", "17"));
        title.add(new Music(R.drawable.seventeen, "Carry On", "17"));

        MusicAdapter adapter = new MusicAdapter(this, title);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
    public void menuButton() {
        Button menuButton = findViewById(R.id.main_menu);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = (new Intent(XActivity.this, MainActivity.class));
                startActivity(intent);
            }
        });
    }
    public void nextPlaylist() {
        Button playlistButton = findViewById(R.id.next_playlist);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = (new Intent(XActivity.this, Billie.class));
                startActivity(intent);
            }
        });
    }
}