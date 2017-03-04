package com.example.administrator.memorymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mv);

        //startMainActivity
        TextView home = (TextView) findViewById(R.id.home_activity);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MVActivity.this,MainActivity.class);
                startActivity(intent);

            }

        });

        //startRankingActivity
        TextView ranking = (TextView) findViewById(R.id.ranking_activity);
        ranking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MVActivity.this,RankingActivity.class);
                startActivity(intent);
            }

        });

        //startMyMusicActivity
        TextView myMusic = (TextView) findViewById(R.id.myMusic_activity);
        myMusic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MVActivity.this,MyMusicActivity.class);
                startActivity(intent);
            }

        });

        //startSearchActivity
        ImageButton search = (ImageButton) findViewById(R.id.search_activity);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MVActivity.this,SearchActivity.class);
                startActivity(intent);
            }

        });
    }
}
