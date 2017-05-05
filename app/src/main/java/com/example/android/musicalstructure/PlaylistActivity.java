package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //Find the View that shows Playlist1 item
        TextView playlist1 = (TextView) findViewById(R.id.Playlist1);

        if (playlist1 != null) {
            //Set a click listener on that View
            playlist1.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the playlist1 View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open Now Playing Activity
                    Intent intentPlaylist1 = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                    //Start the new activity
                    startActivity(intentPlaylist1);
                }
            });
        }

        //Find the View that shows Playlist2 item
        TextView playlist2 = (TextView) findViewById(R.id.Playlist2);

        if (playlist2 != null) {
            //Set a click listener on that View
            playlist2.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the playlist2 View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open Now Playing Activity
                    Intent intentPlaylist2 = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                    //Start the new activity
                    startActivity(intentPlaylist2);
                }
            });
        }

    }
}
