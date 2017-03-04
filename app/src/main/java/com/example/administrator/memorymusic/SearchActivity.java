package com.example.administrator.memorymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //startMainActivity
        TextView home = (TextView) findViewById(R.id.home_activity);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SearchActivity.this,MainActivity.class);
                startActivity(intent);

            }

        });

        //startRankingActivity
        TextView ranking = (TextView) findViewById(R.id.ranking_activity);
        ranking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SearchActivity.this,RankingActivity.class);
                startActivity(intent);
            }

        });

        //startMVActivity
        TextView mv = (TextView) findViewById(R.id.mv_activity);
        mv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SearchActivity.this,MVActivity.class);
                startActivity(intent);
            }

        });

        //startMyMusicActivity
        TextView myMusic = (TextView) findViewById(R.id.myMusic_activity);
        myMusic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SearchActivity.this,MyMusicActivity.class);
                startActivity(intent);
            }

        });

    }
}
