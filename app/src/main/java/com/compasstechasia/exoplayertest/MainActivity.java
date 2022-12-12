package com.compasstechasia.exoplayertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.common.collect.ImmutableList;

import java.util.List;


public class MainActivity extends AppCompatActivity implements Player.Listener {

    StyledPlayerView playerView;
    ExoPlayer exoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerView = findViewById(R.id.exoplayer_view);
        exoPlayer = new ExoPlayer.Builder(this).build();
        playerView.setPlayer(exoPlayer);
        String videoUri = "https://html5demos.com/assets/dizzy.mp4";
        String videoURL = "https://media.geeksforgeeks.org/wp-content/uploads/20201217163353/Screenrecorder-2020-12-17-16-32-03-350.mp4";
        //List<MediaItem> newItems = ImmutableList.of(
      //          MediaItem.fromUri(videoUri),
      //          MediaItem.fromUri(videoURL));
      //  exoPlayer.setMediaItems(newItems, true);
        MediaItem mediaItem1 = MediaItem.fromUri(videoUri);
        MediaItem mediaItem2 = MediaItem.fromUri(videoURL);
        exoPlayer.addMediaItem(mediaItem1);
        exoPlayer.addMediaItem(mediaItem2);
        exoPlayer.prepare();
        exoPlayer.play();

/*
        // Create a data source factory.
        DataSource.Factory dataSourceFactory = new DefaultHttpDataSource.Factory();
// Create a progressive media source pointing to a stream uri.
        MediaSource mediaSource = new ProgressiveMediaSource.Factory(dataSourceFactory)
                .createMediaSource(MediaItem.fromUri(progressiveUri));
// Create a player instance.
        ExoPlayer player = new ExoPlayer.Builder(context).build();
// Set the media source to be played.
        player.setMediaSource(mediaSource);
// Prepare the player.
        player.prepare();

 */
    }
}