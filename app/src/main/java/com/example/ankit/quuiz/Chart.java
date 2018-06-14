package com.example.ankit.quuiz;



import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Chart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        PieChart pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);

        Bundle datas=getIntent().getExtras();

        String message=datas.getString("score");

        int a1=0,b1=0,c1=0,d1=0;
        //  String message="25/25/40/10/";
        String w="";
        char ch;
        int l=message.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            ch=message.charAt(i);
            if(ch!='/')
                w=w+ch;
            else
            {
                c++;
                if(c==1)
                    a1=Integer.parseInt(w);
                if(c==2)
                    b1=Integer.parseInt(w);
                if(c==3)
                    c1=Integer.parseInt(w);
                if(c==4)
                    d1=Integer.parseInt(w);
                w="";
            }
        }
        int[] values={0,0,0,0};
        values[0]=a1;
        values[1]=b1;
        values[2]=c1;
        values[3]=d1;

        String[] label={"A","B","C","D"};
        // IMPORTANT: In a PieChart, no values (Entry) should have the same
        // xIndex (even if from different DataSets), since no values can be
        // drawn above each other.
        int a=5;
        ArrayList<Entry> yvalues = new ArrayList<Entry>();


        PieDataSet dataSet = new PieDataSet(yvalues, "People's Results");

        ArrayList<String> xVals = new ArrayList<String>();

        for(int m=0;m<4;m++){
            yvalues.add(new Entry(values[m],m));
            xVals.add(label[m]);
        }

        ;

        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        pieChart.setData(data);
        pieChart.setDescription("Press Back to Give Answer");

        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(25f);
        pieChart.setHoleRadius(25f);

        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.DKGRAY);


        pieChart.animateXY(1400, 1400);

    }
}