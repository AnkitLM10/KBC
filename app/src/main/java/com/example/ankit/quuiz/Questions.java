package com.example.ankit.quuiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Questions extends AppCompatActivity implements View.OnClickListener
{
Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    bt1=(Button) findViewById(R.id.bt1);
    bt2=(Button) findViewById(R.id.bt2);
    bt3=(Button) findViewById(R.id.bt3);
    bt1.setOnClickListener(this);
    bt2.setOnClickListener(this);
    bt3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       if(v==bt1)
       {
           Intent i =new Intent(Questions.this,MainActivity.class);
           i.putExtra("k",""+1);

       startActivity(i);
           finish();
       }
        if(v==bt2)
        {
            Intent i =new Intent(Questions.this,MainActivity.class);
            i.putExtra("k","2");
            startActivity(i);
        finish();
        }
        if(v==bt3)
        {
            Intent i =new Intent(Questions.this,MainActivity.class);
            i.putExtra("k","3");
            startActivity(i);
            finish();
        }
    }
}
