package com.example.uberv.videostreaming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG=MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vidView = (VideoView)findViewById(R.id.myVideo);
        String videoAddress="https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri videoUri = Uri.parse(videoAddress);
        vidView.setVideoURI(videoUri);

        // create a controller
        MediaController videoController = new MediaController(this);
        videoController.setAnchorView(vidView);
        vidView.setMediaController(videoController);

        // start preview
        vidView.start();
    }
}
