package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Find the View that shows Song1 item
        TextView song1 = (TextView) findViewById(R.id.Song1);

        if (song1 != null) {
            //Set a click listener on that View
            song1.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the song1 View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open Now Playing Activity
                    Intent intentSong1 = new Intent(SongsActivity.this, NowPlayingActivity.class);
                    //Start the new activity
                    startActivity(intentSong1);
                }
            });
        }

        //Find the View that shows Song2 item
        TextView song2 = (TextView) findViewById(R.id.Song2);

        if (song2 != null) {
            //Set a click listener on that View
            song2.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the song2 View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open Now Playing Activity
                    Intent intentSong2 = new Intent(SongsActivity.this, NowPlayingActivity.class);
                    //Start the new activity
                    startActivity(intentSong2);
                }
            });
        }
    }
}
