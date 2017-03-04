package com.example.administrator.memorymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        //startMainActivity
        TextView home = (TextView) findViewById(R.id.home_activity);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MyMusicActivity.this,MainActivity.class);
                startActivity(intent);

            }

        });

        //startRankingActivity
        TextView ranking = (TextView) findViewById(R.id.ranking_activity);
        ranking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MyMusicActivity.this,RankingActivity.class);
                startActivity(intent);
            }

        });

        //startMVActivity
        TextView mv = (TextView) findViewById(R.id.mv_activity);
        mv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MyMusicActivity.this,MVActivity.class);
                startActivity(intent);
            }

        });

        //startSearchActivity
        ImageButton search = (ImageButton) findViewById(R.id.search_activity);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MyMusicActivity.this,SearchActivity.class);
                startActivity(intent);
            }

        });
    }
}
