package com.example.android.newmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Billie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_list);

        //Used to call methods for main menu and other playlist.
        menuButton();
        nextPlaylist();

        ArrayList<Music> title = new ArrayList<Music>();

        title.add(new Music(R.drawable.lovelycoverart, "lovely (with Khalid)", "single"));
        title.add(new Music(R.drawable.crowncoverart, "you should see me in a crown", "single"));
        title.add(new Music(R.drawable.dontsmile, "ocean eyes", "dont smile at me"));
        title.add(new Music(R.drawable.dontsmile, "COPYCAT", "dont smile at me"));
        title.add(new Music(R.drawable.dontsmile, "my boy", "dont smile at me"));
        title.add(new Music(R.drawable.dontsmile, "watch", "dont smile at me"));
        title.add(new Music(R.drawable.dontsmile, "party favor", "dont smile at me"));
        title.add(new Music(R.drawable.dontsmile, "bellyache", "dont smile at me"));
        title.add(new Music(R.drawable.dontsmile, "hostage", "dont smile at me"));
        title.add(new Music(R.drawable.dontsmile, "&burn", "dont smile at me"));

        MusicAdapter adapter = new MusicAdapter(this, title);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
    public void menuButton() {
        Button menuButton = findViewById(R.id.main_menu);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = (new Intent(Billie.this, MainActivity.class));
                startActivity(intent);
            }
        });
    }
    public void nextPlaylist() {
        Button playlistButton = findViewById(R.id.next_playlist);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = (new Intent(Billie.this, XActivity.class));
                startActivity(intent);
            }
        });
    }
}