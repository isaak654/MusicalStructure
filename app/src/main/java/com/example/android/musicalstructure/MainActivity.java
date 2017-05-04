package com.example.android.musicalstructure;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set portrait mode
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows songs Category
        TextView songs = (TextView) findViewById(R.id.songs_txt);

        if (songs != null) {
            //Set a click listener on that View
            songs.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the songs View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open songs Activity
                    Intent intentSongs = new Intent(MainActivity.this, SongsActivity.class);
                    //Start the new activity
                    startActivity(intentSongs);
                }
            });
        }

        //Find the View that shows albums Category
        TextView albums = (TextView) findViewById(R.id.albums_txt);

        if (albums != null) {
            //Set a click listener on that View
            albums.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the albums View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open albums Activity
                    Intent intentAlbums = new Intent(MainActivity.this, AlbumsActivity.class);
                    //Start the new activity
                    startActivity(intentAlbums);
                }
            });
        }

        //Find the View that shows artists Category
        TextView artists = (TextView) findViewById(R.id.artists_txt);

        if (artists != null) {
            //Set a click listener on that View
            artists.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the artists View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open artists Activity
                    Intent intentArtists = new Intent(MainActivity.this, ArtistsActivity.class);
                    //Start the new activity
                    startActivity(intentArtists);
                }
            });
        }

        //Find the View that shows playlist Category
        TextView playlist = (TextView) findViewById(R.id.playlist_txt);

        if (playlist != null) {
            //Set a click listener on that View
            playlist.setOnClickListener(new View.OnClickListener() {
                //This code will be executed when the playlist View is clicked on
                @Override
                public void onClick(View view) {
                    //Create a new intent to open playlist Activity
                    Intent intentPlaylist = new Intent(MainActivity.this, PlaylistActivity.class);
                    //Start the new activity
                    startActivity(intentPlaylist);
                }
            });
        }
    }
}