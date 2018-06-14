package com.example.ankit.quuiz;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity implements View.OnClickListener
{
int index=0;
    TextView tv;
    Button btplay,btquit;
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        index=Integer.parseInt(getIntent().getStringExtra("index"));
btplay=(Button)findViewById(R.id.btplay);
        tv=(TextView)findViewById(R.id.tv);
btquit=(Button)findViewById(R.id.btquit);
        if(savedInstanceState==null) {
            song = MediaPlayer.create(this, R.raw.end);
            song.start();
        }
        if(savedInstanceState!=null)
            index=savedInstanceState.getInt("index");
if(index==0)
    tv.setText(" 0 "+"\n"+" ................");
        else if(index==1)
    tv.setText(" 5000 \n ................");
else if(index==2)
    tv.setText(" 10,000 \n ................");
else if(index==3)
    tv.setText(" 20,000 \n ................");
else if(index==4)
    tv.setText(" 40,000 \n ................");
else if(index==5)
    tv.setText(" 80,000 \n ................");
else if(index==6)
    tv.setText(" 1,60,000 \n ................");
else if(index==7)
    tv.setText(" 3,20,000 \n ................");
else if(index==8)
    tv.setText(" 6,40,000 \n ................");
else if(index==9)
    tv.setText(" 12,50,000 \n ................");
else if(index==10)
    tv.setText(" 25,00,000 \n ................");
else if(index==11)
    tv.setText(" 50,00,000 \n ................");
    else if(index==12)
    tv.setText(" 1 CRORE \n ................");


btplay.setOnClickListener(this);
btquit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
if(v==btplay)
{
    /*
    Intent i=new Intent(Result.this,Front.class);
    startActivity(i);
    finish();
    */
    Intent mStartActivity = new Intent(Result.this, Front.class);
    int mPendingIntentId = 123456;
    PendingIntent mPendingIntent = PendingIntent.getActivity(Result.this, mPendingIntentId,    mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
    AlarmManager mgr = (AlarmManager)Result.this.getSystemService(Context.ALARM_SERVICE);
    mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
    System.exit(0);


}
        else if(v==btquit)
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
    {
        song.start();
    }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("index",index);
    }
}




