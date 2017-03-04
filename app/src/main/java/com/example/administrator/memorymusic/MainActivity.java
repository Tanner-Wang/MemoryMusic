package com.example.administrator.memorymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //startRankingActivity
        TextView ranking = (TextView) findViewById(R.id.ranking_activity);
        ranking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,RankingActivity.class);
startActivity(intent);
            }

        });

        //startMVActivity
        TextView mv = (TextView) findViewById(R.id.mv_activity);
        mv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,MVActivity.class);
                startActivity(intent);
            }

        });

        //startMyMusicActivity
        TextView myMusic = (TextView) findViewById(R.id.myMusic_activity);
        myMusic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,MyMusicActivity.class);
                startActivity(intent);
            }

        });

        //startSearchActivity
        ImageButton search = (ImageButton) findViewById(R.id.search_activity);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }

        });
    }
}
