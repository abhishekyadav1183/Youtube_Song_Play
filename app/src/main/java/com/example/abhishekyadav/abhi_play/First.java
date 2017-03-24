package com.example.abhishekyadav.abhi_play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.net.URLEncoder;

public class First extends YouTubeBaseActivity {
Button play;
EditText Search;
String Movie;
private YouTubePlayerView youTubePlayerView;
private YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Search=(EditText)findViewById(R.id.Search);
         Movie=Search.getText().toString();

String Stringurl="http://gdata.youtube.com/feeds/api/videos?q="+Movie+"&max-results=1&v=2";


        youTubePlayerView=(YouTubePlayerView) findViewById(R.id.view);
        onInitializedListener=new YouTubePlayer.OnInitializedListener() {


            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("Wd2B8OAotU8");



            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        play=(Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                youTubePlayerView.initialize("AIzaSyDQeAAovULBAUH_oHsRKBhMxi5t76ilv4g",onInitializedListener);



            }

        });


    }
}
