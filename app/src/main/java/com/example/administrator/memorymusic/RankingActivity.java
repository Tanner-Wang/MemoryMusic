package com.example.administrator.memorymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        //startMainActivity
        TextView home = (TextView) findViewById(R.id.home_activity);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(RankingActivity.this,MainActivity.class);
                startActivity(intent);
            }

        });

        //startMVActivity
        TextView mv = (TextView) findViewById(R.id.mv_activity);
        mv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(RankingActivity.this,MVActivity.class);
                startActivity(intent);
            }

        });

        //startMyMusicActivity
        TextView myMusic = (TextView) findViewById(R.id.myMusic_activity);
        myMusic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(RankingActivity.this,MyMusicActivity.class);
                startActivity(intent);
            }

        });

        //startSearchActivity
        ImageButton search = (ImageButton) findViewById(R.id.search_activity);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(RankingActivity.this,SearchActivity.class);
                startActivity(intent);
            }

        });
    }
}
