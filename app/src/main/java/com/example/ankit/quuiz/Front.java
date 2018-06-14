package com.example.ankit.quuiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class Front extends AppCompatActivity implements View.OnClickListener{
LinearLayout r;
    MediaPlayer song;
    Button bt1,bt2;
    boolean isSongPlaying;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        if(savedInstanceState==null) {
            song = MediaPlayer.create(this, R.raw.start);
            song.start();
            r = (LinearLayout) findViewById(R.id.main);
            final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.expand);
            r.startAnimation(animShake);
        }
        else
        {
            if(savedInstanceState.getBoolean("isSongPlaying"))
            {
                song=MediaPlayer.create(Front.this,R.raw.start);
                song.start();
              //  song.seekTo(savedInstanceState.getInt("time"));
            }
        }
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        new CountDownTimer(3000, 1000) {
            public void onTick(long time) {
bt1.setAlpha(0);
              bt2.setAlpha(0);
                }

            public void onFinish() {

                bt1.animate().alpha(1.0f).setDuration(3000).start();
                bt2.animate().alpha(1.0f).setDuration(3000).start();
             //bt1.setAlpha(1.0f);
           //  bt2.setAlpha(1.0f);
            }
        }.start();

    bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==bt1)
        {

startActivity(new Intent(Front.this,Questions.class));
finish();
        }
        if(v==bt2)
        {
            int pid = android.os.Process.myPid();
            android.os.Process.killProcess(pid);
            System.exit(0);

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    if(song!=null)
    {
        if(song.isPlaying())
            song.pause();

    }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(song!=null)
            song.start();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
if(song!=null) {
    if (song.isPlaying()) {
        outState.putBoolean("isSongPlaying", true);
        outState.putInt("time", song.getCurrentPosition());

    }
}
    }
}
